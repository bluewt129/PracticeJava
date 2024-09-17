package chap4;
/*
 * break	: switch, 반복문 밖으로 제어 이동
 * continue : 반복문의 처음으로 제어 이동
 */

public class LoopEx5 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println("\n"+i+"단");
			for(int j = 2; j<=9;j++) {
				if(j==5) break; //break가 속한 반복문 종료
					System.out.println(i+"*"+j+"="+(i*j));
				if(j==5) continue; //반복문의 처음으로 간다
				System.out.println(i+"*"+j+"="+(i*j));	
			}
		}
	}
}
