package chap4;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		System.out.println("1~100 사이의 숫자를 입력하세요");
		int num2 = sc.nextInt();
		int cnt = 1;
		while(num>num2 || num<num2) {
			if(num>num2) {
				System.out.println("큰 수입니다");
				num2 = sc.nextInt();
				cnt++;
			}else if(num<num2) {
				System.out.println("작은 수입니다");
				num2 = sc.nextInt();}
			}System.out.println("정답입니다");
			System.out.print("입력횟수 : "+cnt);
			System.out.println((cnt<=5)?" 빠르시네요":(cnt<=10)?" 보통":" 느려");
		System.out.println("프로그램을 종료합니다");
	}
}

