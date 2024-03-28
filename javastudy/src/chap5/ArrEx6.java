package chap5;

/* Command 라인에서 파라미터값 전달하기
 * 자바프로그램 실행 순서
 * 1. 소스 코딩 : ArrEx6.java
 * 2. 컴파일
 * 		javac ArrEx6.java
 * 		=> ArrEx6.class 바이트 코드 생성
 * 3. 실행(Java 인터페이스)
 * 		java ArrEx6 홍길동 김삿갓
 * 		java 인터페이스의 기능
 * 		1. JVM 환경생성 => 클래스영역(메서드 영역, 상수풀), 스택영역, 힙영역
 * 		2. 바이트코드 메모리에 로드, 검증 => 클래스정보를 메모리에 로드한다
 * 		3. main 메서드 실행 => command 라인의 파라미터값을 문자열형 배열로 생성해서 main에 전달
 * 		   args 배열 : command 라인의 파라미터값 저장
 */

public class ArrEx6 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return; // 메서드의 종료
		}
		for(String s : args) {
			System.out.println(s);
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("arr["+i+"]="+args[i]);
		}
	}
}
