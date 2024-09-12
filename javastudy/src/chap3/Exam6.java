package chap3;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사과의 갯수를 입력하세요");
		int apple = sc.nextInt();
		System.out.println("필요한 바구니갯수:"+((apple%10==0)?apple/10:(apple/10+1))+"개");
	}
}
