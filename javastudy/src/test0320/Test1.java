package test0320;

import java.util.Scanner;

/*
1.   ch 변수의  문자가 
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을  출력하기
     그외의 문자는 기타 문자 를 출력하세요 
[결과]
A : a
b : B
1 : 21
- :기타문자
    
*/
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한개의 문자를 입력하세요");
		char ch = sc.next().charAt(0);
		if(ch>=65 && ch<=90) {
			System.out.println(ch+":"+(char)(ch+32));
		}else if(ch>=97 && ch<=122) {
			System.out.println(ch+":"+(char)(ch-32));
		}else if(ch>=48 && ch<=57) {
			System.out.println(ch+":"+(ch-28));
		}else {
			System.out.println("기타문자");
		}
	}
}
