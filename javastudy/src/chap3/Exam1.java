package chap3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("x="+ x++);
		System.out.println("x="+ --x);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력");
		
		x = sc.nextInt();

		System.out.println("x="+ x++);
		System.out.println("x="+ --x);

	}
}
