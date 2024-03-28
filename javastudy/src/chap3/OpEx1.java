package chap3;

public class OpEx1 {

	public static void main(String[] args) {
		int x = 5, y = 5, z = 5;
		x++;
		y--;
		System.out.println("x="+x+"y="+y);
		
		++x;
		--y;
		System.out.println("x="+x+"y="+y);
		
		x=y=5;
		y = x++;
		System.out.println("x="+x+"y="+y);
		
		y = ++x;
		System.out.println("x="+x+"y="+y);
		
		x = y = 5;
		System.out.println("x="+ x++);
		System.out.println("x="+ ++x);
		System.out.println("y="+ y--);
		System.out.println("y="+ --y);

	}

}
