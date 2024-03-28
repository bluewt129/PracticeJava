package chap6;

class Rectangle3{
	int width, height, sno;
	static int cnt;
	Rectangle3(int w, int h){
		width = w;
		height = h;
		sno = ++cnt;
	}
	int area() {
		return width*height;
	}
	int length() {
		return (width+height)*2;
	}
	boolean isSquare() {
		return width==height;
	}
	public String toString() {
		return "사각형번호"+sno+", 넓이"+area()+", 둘레"+length()+(isSquare()?", 정사각형":", 직사각형")+
				",생성된 사각형의 갯수:"+cnt;
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Rectangle3 r = new Rectangle3(10, 20);
		System.out.println(r);
	}
}
