package chap4;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int snum = (int)(Math.random()*100)+1;
		int unum = 0;
		System.out.println("1~100 사이의 숫자를 입력하세요");
		do {
			unum = sc.nextInt();
			if(unum>snum) {
				System.out.println("작은수 입니다");
			}else if(unum<snum){
				System.out.println("큰수 입니다");
			}
		}while(unum != snum);
		System.out.println("정답입니다");
		System.out.println("프로그램을 종료합니다");
	}
}
