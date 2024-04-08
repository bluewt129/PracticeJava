package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 * 가로로 출력하기
 * 99숫자가 입력되면 프로그램 종료하기
 * 입력값이 숫자가 아닌 경우 : InputMismatchException 예외가 발생고
                        숫자만 입력하세요 메세지 출력하고, 다시 입력받기
   입력값이 1~10의 범위가  아닌 경우 : MyInputNumberException 예외를 발생 시키고
                        1 ~ 10까지의 숫자만 입력하세요 메세지 출력하고, 다시 입력받기 
   구동클래스와 MyInputNumberException 예외 클래스 구현하기
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. 99를 누르면 프로그램 종료.");
		while(true) {
			try {
				int a = sc.nextInt();
				if(a==99) {
					break;
				}
				if(a>0 && a<11) {
					for(int i=1;i<=a;i++) {
					System.out.print("*");
					}
				}else {
					throw new Exception("1~10 까지만 입력하세요");
				}
				System.out.println();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.next();
			}
			catch(Exception e) {
				System.out.println("1~10 까지만 입력하세요.");
			}
		}
	}
}
