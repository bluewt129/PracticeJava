package test0411;
/*
 * ThreadEx7.java  소스의 PrintThread1 클래스를 Runnable 인터페이스를 구현하는 방식으로 수정하기
 * PrintRunnable1 : Runnable 인터페이스 구현 클래스
 */
class PrintRunnable1 implements Runnable{
	char ch;
	static Object lock = new Object();
	PrintRunnable1(char ch){
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			synchronized(lock) {
				for(int j=0;j<20;j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		PrintRunnable1 p1 = new PrintRunnable1('1');
		PrintRunnable1 p2 = new PrintRunnable1('2');
		PrintRunnable1 p3 = new PrintRunnable1('3');
		p1.run(); p2.run(); p3.run();

	}

}
