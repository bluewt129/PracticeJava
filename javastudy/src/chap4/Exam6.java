package chap4;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이 :");
		int height = sc.nextInt();
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
