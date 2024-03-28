package chap6;
/*
 * 구동 클래스를 실행했을 때 결과가 출력되도록 EastCard 구현하기
 * EastCard
 * 		멤버변수 : int number, boolean isKwang
 * 		생성자 : 구동 클래스에 맞도록 구현
 * 		멤버메서드 : toString() : 결과가 나오도록 구현
 * 
 * 	[결과]
 *  3 => number:3, isKwang : false
 *  1K => number:1, isKwang : true
 */
class EastCard{
	int number;
	boolean isKwang;
	public EastCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	public EastCard() {
		this(1,true);
	}
	public String toString() {
		return number + (isKwang?"k":"");
	}
}
public class Exam3 {

	public static void main(String[] args) {
		EastCard e1 = new EastCard(3,false);
		System.out.println(e1);
		EastCard e2 = new EastCard();
		System.out.println(e2);
	}
}
