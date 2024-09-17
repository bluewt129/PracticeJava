package chap4;

import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int innum = sc.nextInt();
		int num = innum;
		int sum = 0;
		while(num > 0) {
			sum += num%10; //num 을 10으로 나눈 나머지값을 더해라 1234 중 4를 더하게됨
			num /= 10;	   //num 을 10으로 나눈 몫을 num에 대입해라 1234 중 4가 탈락해서 123 대입
						   //123은 0보다 크므로 다시 1번 반복문으로 간다
		}
		System.out.println(innum+"의 자리수 합 :"+sum);
	}
}
