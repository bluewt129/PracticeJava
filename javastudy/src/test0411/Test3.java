package test0411;
/*
 * 생산자 스레드, 소비자 스레드 문제
 * CarMarket 클래스 : 자동차 판매소
 *    멤버 변수 : String carName;
 *    멤버메서드 :
 *       String getCar() : 임의의 자동차를 선택 리턴
 *       synchronized String push() : carName변수에 저장 기능
 *       synchronized String pop() : carName변수값을 null로 변경

 *  Seller 클래스 : 판매원. Thread 클래스 상속
 *     멤버메서드 : run()
 *         carName에 객체가 존재하면 pop 메서드 호출하기.
 *         carName에 객체가 없으면 wait()
 *         0 ~ 2000밀리초를 임의로 sleep()
 *  Producer 클래스 : 자동차 공급자. Thread 클래스 상속       
 *     멤버메서드 : run()
 *         push() 메서드 호출하여 carName에 객체를 저함.
 *         carName 객체가 존재하면 notifyAll() 함.
 *         0 ~ 5000밀리초를 임의로 sleep()
 */
class CarMarket{
	String carName;
	CarMarket(){}
	CarMarket(String carName){
		this.carName = carName;
	}
	String getCar() {
		String[] car = {"모닝", "K7", "싼타페", "아우디", "벤츠", "그랜져"};
		int a = (int)(Math.random()*6);
		carName = car[a];
		return carName;
	}
	synchronized String pop(int i) {
		while(carName == null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		notifyAll();
		System.out.println((i+1) + Thread.currentThread().getName()+carName+" 판매함");
		return carName = null;
	}
	synchronized String push(int i) {
		while(carName!=null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		getCar();
		notifyAll();
		System.out.println((i+1)+Thread.currentThread().getName()+carName+" 생산함");
		return carName;
	}
}
class Seller extends Thread{
	CarMarket carmarket;
	Seller(CarMarket carmarket){
		super(" : Seller => ");
		this.carmarket = carmarket;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			carmarket.pop(i);
			try {
				sleep((int)(Math.random()*2000));
			}catch(InterruptedException e) {}
		}
	}
}
class Producer extends Thread{
	CarMarket carmarket;
	static int cnt = 1;
	Producer(CarMarket carmarket){
		super(" : Producer => ");
		this.carmarket = carmarket;
		cnt++;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			carmarket.push(i);
			try {
				sleep((int)(Math.random()*5000));
			} catch (InterruptedException e) {}
		}
	}
}
public class Test3 {
	public static void main(String[] args) {
		CarMarket cm = new CarMarket();
		Thread p = new Producer(cm);
		Thread s = new Seller(cm);
		p.start();
		s.start();
	}
}
