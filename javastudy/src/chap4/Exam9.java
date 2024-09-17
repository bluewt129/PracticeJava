package chap4;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이 :");
		int height = sc.nextInt();
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=height;j++) {
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}System.out.println();
		}
	}
}

