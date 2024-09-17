package chap6;

/*
 * 클래스
 * 	변수(필드) - 클래스 변수
 * 			- 인스턴스변수
 * 	메서드 	- 클래스메서드
 * 			- 인스턴스메서드
 * 
 *  클래스 멤버 : 클래스 변수, 클래스 메서드
 *  인스턴스 멤버 : 인스턴스 변수, 인스턴스 메서드
 *  
 *  클래스 멤버에서 클래스 멤버 호출 : 정상
 *  인스턴스 멤버에서 인스턴스 멤버 호출 : 정상
 *  클래스 멤버에서 인스턴스 멤버 호출 : 객체화 필요
 *  인스턴스 멤버에서 클래스 멤버 호출 : 정상
 *  
 *  같은 멤버 간에는 클래스명, 참조변수명 생략 가능
 *  단 클래스멤버에서 인스턴스 멤버 호출시 객체화가 필요하므로, 참조변수명 사용함
 */

public class MemberCall {

		static int cv1 = 10; //클래스 멤버
		static int cv2 = 20; //클래스 멤버
		int iv1 = 100;		// 인스턴스 멤버
		int iv2 = iv1;		// 인스턴스 멤버
		int iv3 = cv1;		// 인스턴스 멤버 클래스 멤버의 값이 인스턴스 멤버에 들어감
		//static int cv3 = iv1; //클래스 멤버에서 인스턴스 멤버값을 가져오려고 하니 오류가 남. 객체화가 안되었기때문.
		static int cv = new MemberCall().iv1; // 이렇게 객체화 필요.
		void method1() { //static이 없으니 인스턴스 멤버
			System.out.println("cv1+cv2="+(cv1+cv2)); //클래스 멤버끼리 호출 가능
			System.out.println("iv1+iv2="+(iv1+iv2)); //인스턴스 멤버끼리 호출 가능
		}
		static void method2() { //클래스 멤버
			System.out.println("cv1+cv2="+(cv1+cv2));
			//System.out.println("iv1+iv2="+(iv1+iv2));// 클래스 멤버에서 인스턴스 멤버 직접호출 불가
			//객체화 필요
			MemberCall m = new MemberCall();
			System.out.println("iv1+iv2="+(m.iv1+m.iv2));
		}
		void method3() { //인스턴스 멤버
			method1(); //같은 인스턴스 멤버 호출 가능
			method2(); //클래스멤버지만 인스턴스가 준비되면 클래스는 이미 준비된 상태이기 때문에 호출가능
		}
		static void method4() { //클래스 멤버
			//method1(); //인스턴스 멤버
			new MemberCall().method1();
			method2(); //클래스 멤버
		}
	public static void main(String[] args) {
		MemberCall m = new MemberCall();
		m.method1();
		MemberCall.method2();
		m.method3();
		MemberCall.method4();

	}
}
