package chap6;
/*
 * 추상화 : 클래스 생성 단계
 * 	클래스 : 사용자 정의 자료형. 객체 생성 도구. => 객체지향언어에서 가장 중요한 개념
 * 		속성 : 멤버필드, 멤버변수
 *		기능 : 멤버메서드, 멤버함수
 *
 * 하나의 파일에 여러개의 클래스 존재 가능
 * 	- 파일의 이름은 반드시 public class 클래스명과 같다 (StudentEx1.java)
 *  - 그러므로 하나의 파일에는 하나의 public class만 가능하다
 *  
 * Java Application
 *  - main 함수가 프로그램의 시작 (반드시 main 함수가 있어야함. 없다면 Java Application이 아니다)
 *  - main 함수를 포함하고 있는 클래스를 구동(실행)클래스라고 부른다
 *  - 구동클래스를 public class로 선언한다
 */
class Student{
	String studno;
	String name;
	String major;
	void study() {
		System.out.println("열심히 공부합시다");
	}
}

public class StudentEx1 {

	public static void main(String[] args) {
		Student st1 = new Student(); //객체화, 인스턴스화
		/*
		 * new 예약어 기능
		 * 1. 힙영역에 메모리 할당 => 객체 생성
		 * 2. 멤버필드값을 기본값으로 초기화
		 * 		숫자형 : 0
		 * 		boolean : false
		 * 		그외 : null
		 * 3. 생성자 호출
		 * 
		 * 대입연사자를 이용하여 객체의 참조값을 참조변수에 대입
		 */
		st1.studno = "A240101";
		st1.name = "홍길동";
		st1.major = "컴퓨터공학";
		System.out.printf
		("학번:%s, 이름:%s, 전공:%s\n",st1.studno,st1.name,st1.major);
		st1.study();
		// A240101, 김삿갓, 경영 인 학생의 객체를 생성
		
		Student st2 = new Student();
		st2.studno = "A240101";
		st2.name = "김삿갓";
		st2.major = "경영";
		System.out.printf
		("학번:%s, 이름:%s, 전공:%s\n",st2.studno,st2.name,st2.major);
		st2.study();
		
		st2 = st1;
		st1.name = "이몽룡"; 
		System.out.println("st2 = st1 이후 실행");
		System.out.printf
		("학번:%s, 이름:%s, 전공:%s\n",st1.studno,st1.name,st1.major);
		System.out.printf
		("학번:%s, 이름:%s, 전공:%s\n",st2.studno,st2.name,st2.major);
	}

}
