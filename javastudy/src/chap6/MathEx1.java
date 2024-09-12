package chap6;
/*
 * 멤버 메서드 (멤버함수, Function)
 * [접근제어자][제어자] 리턴타입 메서드명(매개변수목록) => 선언부
 * {.......}								=> 구현부
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형
 * 			void 인 경우는 전달되는 값이 없다
 * 			대표적인 void는 main 메서드이다
 * 
 * 매개변수 : 메서드 호출(실행)시 메서드에 전달되는 값의 자료형
 * 			(자료형1 변수명1, 자료형2 변수명2, ...) 
 */

class Math1{
	int add1(int a, int b) {
		return a+b; // a+b 
	}
	long add2(int a, int b) {
		return a+b; // a+b 자료형 : int, 리턴타입 : long => 자동형변환
	}
	void add3(int a, int b) {
		System.out.println(a+b);
		return; // 메서드 종료. 생략 가능. 메서드 } 실행되면 메서드 종료됨
	}
}

public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10, 20);
		System.out.println(a1);
		long a2 = m1.add2(10, 20);
		System.out.println(a1);
		m1.add3(10, 20);
	}
}
