package chap6;

class Car2{
	String color; //객체화시 변수가 됨 => 인스턴스 변수
	int num; //인스턴스 변수
	int sno; //인스턴스 변수
	static int cnt; //클래스정보 로드시 변수가 됨 => 클래스 변수
	// 객체를 문자열화 하는 메서드 
	public String toString() { //toSting 메서드는 반드시 public과 함께 와야한다
		return "자동차번호:"+sno+"=>"+color+","+num+",자동차생산갯수"+cnt;
	}
}

public class StaticValEx1 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color = "white";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		System.out.println(c1); // 참조변수 출력시 toString() 메서드 자동 호출함
		
		Car2 c2 = new Car2();
		c2.color = "red";
		c2.num = 4444;
		c2.sno = ++Car2.cnt;
		System.out.println(c1); 
		System.out.println(c2);
	}

}
