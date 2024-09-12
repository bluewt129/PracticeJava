package chap3;

import java.util.Scanner;
public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 자연수를 입력하세요.");
		
		int thr = sc.nextInt();
		
		System.out.println((thr/100)*100);

	}

}
