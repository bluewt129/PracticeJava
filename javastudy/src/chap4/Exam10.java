package chap4;

import java.util.Scanner;

/*
 * 높이 1 : 별 1 : 1 * 2 - 1 = 1
 * 높이 2 : 별 3 : 2 * 2 - 1 = 3
 * 높이 3 : 별 5 : 3 * 2 - 1 = 5
 * 높이 4 : 별 7 : 4 * 2 - 1 = 7
 * 높이 5 : 별 9 : 5 * 2 - 1 = 9
 * => 높이 * 2 - 1 => 바닥의 갯수
 * 
 *				i    *위치 
 *    *			0    2		=> 2-0 ~ 2+0
 *   ***		1    123	=> 2-1 ~ 2+1
 *  *****		2    012344 => 2-2 ~ 2+2 =>바닥의 갯수/2 = 중간인덱스값
 */

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이 :");
		int height = sc.nextInt();
		int b = height * 2 -1;
		int m = b/2;
		for(int i=0;i<height;i++) {
			for(int j=0;j<=m+i;j++) {
				if(j >= m-i && j<=m+i) {System.out.print("*");}
				else {System.out.print(" ");}
			}System.out.println();
		}
	}
}

