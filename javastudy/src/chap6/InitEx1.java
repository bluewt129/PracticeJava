package chap6;
/*
 * 초기화 블럭 예제
 * static 초기화블럭
 * 		기능 : 클래스 변수의 초기화
 * 		실행 시점 : 클래스 정보 로드시 한번 실행. main 메서드보다 이전에 실행.
 * 인스턴스 초기화블럭
 * 		기능 : 인스턴스변수의 초기화. 생성자와 기능의 겹침
 * 		실행 시점 : 객체화시마다 생성자 호출 전에 실행
 */
public class InitEx1 {
	static int cv;
	int iv;
	InitEx1(){
		System.out.println("5.생성자 호출됨");
	}
	static { //static 초기화 블럭 > main보다 먼저 실행된다. 처음 딱 한번만 실행된다.
		cv = (int)(Math.random()*100);
		System.out.println("1.static 초기화 블럭 실행. cv = "+cv);
	}
	{	//인스턴스 초기화 블럭 > 대체로 따로 작성하지 않고 생성자 내부에 쓴다. 객체 생성때마다 호출됨.
		iv = (int)(Math.random()*100);
		System.out.println("4. 인스턴스 초기화 블럭 실행. iv = "+iv);
	}

	public static void main(String[] args) {
		System.out.println("2.main 메서드 시작");
		System.out.println("3.main 메서드에서 init1 객체 생성 cv = "+cv);
		InitEx1 init1 = new InitEx1();
		System.out.println("3.main 메서드에서 init2 객체 생성 cv = "+cv);
		InitEx1 init2 = new InitEx1();
		System.out.println("6.main 메서드 종료");

	}

}
