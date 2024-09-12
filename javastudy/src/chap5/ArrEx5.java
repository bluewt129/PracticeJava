package chap5;

import java.util.Scanner;

public class ArrEx5 {

	public static void main(String[] args) {
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8];
		System.out.println("16진수로 변환할 10진수를 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divnum = num;
		int index = 0;
		while(divnum > 0) {
			hex[index++] = data[divnum%16]; //divnum에 A가 들어가면 나눌 방법이 없기 때문에 참조를 사용
			divnum /= 16;
		}
		System.out.println(num+"의 16진수");
		for(int i=index-1;i>=0;i--) {
			System.out.print(hex[i]);
		}
		System.out.println();
		System.out.println("Integer 클래스를 이용한 16진수 변환");
		System.out.println(Integer.toHexString(num));

	}

}
