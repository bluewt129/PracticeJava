package chap4;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if(score>=60) { //if 조건문 : 조건문의 결과가 참인 경우만 {} 내용 실행
			System.out.println("합격입니다");
		}
		
		System.out.println((score>=60)?"합격입니다":"다음기회에");
		if(score>=60) {
			System.out.println("축하합니다");
		}else{
			System.out.println("다음 기회에");
		}
		if(score>=90) {
			System.out.println("A학점");
		} else if (score >= 80){
			System.out.println("B학점");
		} else if (score >= 70){
			System.out.println("C학점");
		} else if (score >= 60){
	        System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		System.out.println((score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F");
	}
}
	

