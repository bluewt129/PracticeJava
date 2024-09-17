package chap4;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이 :");
		int n = sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n;j++) {
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}System.out.println();
		}
	}
}

