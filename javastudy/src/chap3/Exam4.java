package chap3;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.println(a+((a>0)?" :양수":((a<0)?" :음수":"영")));

	}

}
