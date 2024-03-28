package chap4;

import java.util.Scanner;

/*
 * 화면에서 문자를 입력받아서 대문자/소문자/숫자/기타문자인지 출력하기
 * 대문자 : 'A' <= ch <= 'Z' ch >= 'A' && ch <= 'Z'
 * 소문자 : 'a' <= ch <= 'z' ch >= 'a' && ch <= 'z'
 * 숫자 : '0' <= ch <= '9' ch >= '0' && ch <= '9'
 */

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		//String sc.next() : 입력받은 데이터를 문자열로 인식함
		//String.charAt(index) : 문자열 내에서 index 에 해당하는 char 데이터를 리턴한다
		//charAt(0) 는 index : 0부터 시작. 첫번째 문자를 의미.
		char ch = sc.next().charAt(0); //화면에서 문자열을 입력받아 첫번째 char값을 ch변수에 저장
		//문자를 여러개 가져와도 첫번째 문자만 해당된다
		if('a' <= ch && ch <= 'z') {
			System.out.println(ch+":"+"소문자");
		}else if('A' <= ch && ch <= 'Z') {
			System.out.println(ch+":"+"대문자");
		}else if('0' <= ch && ch <= '9') {
			System.out.println(ch+":"+"숫자");
		}else {
			System.out.println(ch+":"+"기타문자");
		}

	}

}
