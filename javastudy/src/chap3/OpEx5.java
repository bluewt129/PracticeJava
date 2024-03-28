package chap3;
import java.util.Scanner;
public class OpEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		System.out.println(score+"점은 "+((score>=60)?"합격입니다":"불합격입니다"));
		
		System.out.println(score+"점은 "+((score>=70)?"통과":(score>=60)?"재시험":"탈락"));
		System.out.println("철수\t영희");

	}

}
