package test0322;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp = num;
		int result = 0;
		while(tmp!=0) {
			result *= 10;
			result += tmp%10;
			tmp /= 10;
		}
		if(num==result) {
			System.out.println(num+": 대칭수");
		}else {
			System.out.println(num+":대칭수 아님");
		}
		String snum = ""+num;
		String rsnum="";
		for(int i=snum.length()-1;i>=0;i--) {
			rsnum += snum.charAt(i);
		}
		if(snum.equals(rsnum)) {
			System.out.println(num+":대칭수");
		}else {
			System.out.println(num+":대칭수아님");
		}
		boolean flag = true;
		for(int i=0,j=snum.length()-1;i<snum.length();i++,j--) {
			if(snum.charAt(i)!=snum.charAt(j)) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println("대칭수");
		}else {
			System.out.println("대칭수아님");
		}
	}
}
