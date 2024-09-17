package chap6;

public class Rectangle2 {
	
	int width;
	int height;
	int sno;
	static int cnt;
	int area() {
		return width*height;
	}
	int length() {
		return (width*height)*2;
	}
	boolean isSquare() {
		return width==height;
	}
	public String toString() {
		return sno+"번사각형=>"+width+","+height+"),넓이:"+area()+
				",둘레:"+length()+","+(isSquare()?"정사각형":"직사각형")+
				",생성된 사각형의 갯수:"+cnt;
	}

	public static void main(String[] args) {
	}
}
