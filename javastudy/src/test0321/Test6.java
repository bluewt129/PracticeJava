package test0321;


import java.util.Scanner;
/*

삼각형의 높이를 홀수로 입력하세요
5
*****
 ***
  *
 ***
*****


 */
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = 0;
		while(true) {
			System.out.println("삼각형 높이 홀수 입력");
			h = sc.nextInt();
			if(h%2==0) {
				System.out.println("홀수입력");
			}else {
				break;
			}
		}
		
		for(int i = 0; i <= h; i++) { // 5/2=2, i:0,1,2 => 3줄
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*(h-1)+1 - 2*i; j++ ) {
				System.out.print("*");  
			}
			System.out.println();
		}
		
		for(int i = h/2+1; i < h; i++) {
			for(int j = 0; j <= i; j++) {
				if(j>=h-i-1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			System.out.println();
			}
		}
	}
}
