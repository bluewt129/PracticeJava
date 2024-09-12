package test0321;


import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3			i	j
*****		0	
 ***		1
  *			2
 
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int b = len * 2 - 1;//바닥 별 갯수
		int m = b/2;
		for(int i=0;i<len;i++) {
			for(int j=0;j<b-i;j++) {
				if(j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
