package test0319;
import java.util.Scanner;
//  반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요");
		int half = sc.nextInt();
		double round = 2 * half * pi;
		double area = half * half * pi;
		
		System.out.printf("원의 둘레는 "+"%.2f",round);
		
		System.out.printf("원의 면적은 "+"%.2f",area);
	}
}
