package chap4;
/*
 * switch 구문 : 조건문
 * 조건값 : 정수형값 또는 문자열값만 가능
 * switch (조건값) {
 *    case 값1 : 문장1;
 *    case 값2 : 문장2;
 *    ...
 *    default : 그외문장;
 *    }
 */

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String result = null;
		switch(score/10) {
		case 10 : 
		case 9 : result = "A학점";
		break;
		case 8 : result = "B학점";
		break;
		case 7 : result = "C학점";
		break;
		case 6 : result = "D학점";
		break;
		default : result = "F학점";
		}
		System.out.println(score+":"+result);
		
		switch(score/10) {
		case 10:case 9:case 8:case 7:case 6: result="Pass";break;
		
		}
	}

}
