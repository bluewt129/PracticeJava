package test0411;
/*
 * ThreadEx8.java  소스의 PrintThread2 클래스를 Runnable 인터페이스를 구현하는 방식으로 수정하기
 * PrintRunnable2 : Runnable 인터페이스 구현 클래스
 */
class PrintRunnable2 implements Runnable{
	Printer ptr;
	char ch;
	PrintRunnable2(Printer ptr, char ch){
		this.ptr = ptr;
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			ptr.printChar(ch);
		}
	}
}
class Printer{
	public synchronized void printChar(char ch) {
		for(int i=0;i<20;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
public class Test2 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintRunnable2 p1 = new PrintRunnable2(ptr, '1');
		PrintRunnable2 p2 = new PrintRunnable2(ptr, '2');
		PrintRunnable2 p3 = new PrintRunnable2(ptr, '3');
		p1.run(); p2.run(); p3.run();
	}

}
