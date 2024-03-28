package chap6;

class Rectangle {
	int width;
	int height;
	void area() {
		System.out.println(width*height);
	}
	void length() {
		System.out.println(width+height*2);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.width = 10;
		rec1.height = 5;
		rec1.area();
		rec1.length();
		
		Rectangle rec2 = new Rectangle();
		rec2.width = 10;
		rec2.height = 10;
		rec2.area();
		rec2.length();
	}
}
