package test0319;
import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 길이");
		int line = sc.nextInt();

		System.out.println("높이의 길이");
		int height = sc.nextInt();
		
		System.out.println("넓이="+line+"*"+height+"/"+2+"="+(double)(line*height)/2);


	}
}
