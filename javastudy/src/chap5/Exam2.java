package chap5;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int[] octal = new int[32];
		System.out.println("10진수 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int index=0;
		while(num>0) {
			octal[index++] = num%8;
			num /= 8;
		}
		System.out.print(num+"의 8진수 : ");
		for(int i=index-1;i>=0;i--) {
			System.out.print(octal[i]);
		}
		System.out.println();
		System.out.println("2진수 변환:"+Integer.toBinaryString(num));
		System.out.println("8진수 변환:"+Integer.toOctalString(num));

	}

}
