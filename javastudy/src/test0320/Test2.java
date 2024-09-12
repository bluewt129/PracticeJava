package test0320;

import java.util.Scanner;

/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
  한개의 숫자를 입력받아 가위바위보 게임하기 
  
  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!

  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
*/

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rcpc = (int)(Math.random()*3+1);
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요");
		int rcpu = sc.nextInt();
		switch(rcpu) {
		case 1 : System.out.println((rcpc==2)?"시스템 승리":(rcpc==3)?"사용자 승리":"비김"); break;
		case 2 : System.out.println((rcpc==3)?"시스템 승리":(rcpc==1)?"사용자 승리":"비김"); break;
		case 3 : System.out.println((rcpc==1)?"시스템 승리":(rcpc==2)?"사용자 승리":"비김"); break;		
		}
	}
}
