package chap4;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String in1 = sc.next();
		// 첫번째 숫자 : in1.charAt(0) - '0' : => 숫자값1 // 아스키 코드값 빼야한다
		// 두번째 숫자 : in1.charAt(1) - '0' : => 숫자값2
		// 세번째 숫자 : in1.charAt(2) - '0' : => 숫자값3
		int sum = 0;
		for(int i=0; i<in1.length(); i++) {
			sum += in1.charAt(i) - '0';
			System.out.print(in1.charAt(i)+((i==in1.length()-1)?"=":"+"));
		}System.out.println(sum);
	}
}
