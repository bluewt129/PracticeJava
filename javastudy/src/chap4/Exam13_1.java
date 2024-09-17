package chap4;

import java.util.Scanner;

public class Exam13_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자들을 입력하세요(종료:999)");
		int num = 0;
		int sum = 0;
		while(num<999) {
			num = sc.nextInt();
			sum += num;
		}System.out.println(sum-999);
		
	}
}
