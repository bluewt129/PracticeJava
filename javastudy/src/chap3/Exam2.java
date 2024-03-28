package chap3;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("??초는 = ?시 ?분 ?초입니다."); //시간 계산 프로그램
		
		int sec = sc.nextInt();
		int h = sec/3600;
		int m = (sec%3600)/60;
		int s = (sec%60);
		
		System.out.println(sec+"초는");
		System.out.println(h+"시");
		System.out.println(m+"분");
		System.out.println(s+"초 입니다.");
		

	}

}
