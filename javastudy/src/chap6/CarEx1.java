package chap6;
/*
 *  선언 위치에 따른 변수의 종류
 *  					선언위치		선언 방법				메모리 할당시점		메모리 할당위치
 *  	- 클래스 변수		클래스 내부	static 자료형 변수명	클래스 정보 로드시	클래스 영역
 *  		=> 객체화 필요없음. 모든 객체의 공통변수로 사용된다.
 *  		=> 클래스명.변수명
 *  		=> 기본값으로 초기화
 *  	- 인스턴스 변수		클래스 내부	자료형 변수명			객체화시			힙 영역
 *  		=> 객체화 필요.객체별로 다른 메모리 할당됨.
 *  		=> 참조변수명.변수명
 *  		=> 기본값으로 초기화
 *  	- 지역 변수		메서드 내부	자료형 변수명			선언문 실행시		스택 영역
 *  		=> 메서드, 블럭 내에서만 사용 가능
 *  		=> 기본값으로 초기화 안됨
 *  		=> 매개변수는 지역변수
 */	

class Car{
	String color;		// 인스턴스 변수(객체변수) 인스턴스 필드라고도 부름
	int number;			// 인스턴스 변수(객체변수)
	static int width = 200; // 클래스 변수
	static int height = 120; // 클래스 변수
	public String toString() { //지역 변수 없음(현재 선언된 것이 없음)
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class CarEx1 {

	public static void main(String[] args) { //매개변수 args 또한 지역변수이다
		Car c1 = new Car();	//c1 지역변수
		c1.color = "white";
		c1.number = 1234;
		System.out.println("c1:"+c1.toString());
		
		Car c2 = new Car(); //c2 지역변수
		c2.color = "red";
		c2.number = 5242;
		System.out.println("c2:"+c2.toString());
		
		Car.width = 80; //c1.width = 80;
		Car.height = 50; //c1.height = 50;
		System.out.println("c1:"+c1.toString());
		System.out.println("c2:"+c2.toString());
		
		int num = 0;
		System.out.println(num);
		
		int i;
		boolean b = true;
		if(b) {
			i = 10;
			System.out.println(i);
		}

	}

}
