package test0321;


import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = h * 2 -1;
		int data = 0; //첫번째 숫자값 저장
		for(int i=b;i>=1;i-=2) {
			data += i;
		}
		int m = b/2;
		for(int i=0;i<h;i++) {
			for(int j=0;j<=m+i;j++) {
				if(j >= m-i && j<=m+i) {
						System.out.print(data-- + "\t");
						//System.out.printf("%5d", data--);
					}
				else {System.out.print("\t");}
			}System.out.println();
		}
	}
}