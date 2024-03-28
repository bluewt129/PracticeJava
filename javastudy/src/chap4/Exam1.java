package chap4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int i1 = sc.nextInt();
		System.out.print(i1);
		System.out.printf(":");
		if(i1>0) {
			System.out.println("양수");
		}else if(i1<0) {
			System.out.println("음수");
		}else {
			System.out.println("영");
		}
		if(i1%2==0) {
			System.out.println("짝수");
		}else if(i1%2==1){
			System.out.println("홀수");
		}
		
		System.out.print(i1+":");
		System.out.println((i1%2==0)?"짝수":"홀수");
	}	
}
