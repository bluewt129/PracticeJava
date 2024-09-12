package chap5;

import java.util.Scanner;

public class ArrEx7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[][] arr = {{10, 20}, {30,40}, {50,60}};
		for(i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
		System.out.println();
		}
		System.out.println("arr 배열의 행과 열의 합계 출력");
				
		int[] colsum = new int[arr[0].length];
		for(i=0;i<arr.length;i++) {
		int sum = 0;
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				colsum[j] += arr[i][j];
			}
			System.out.println(i+"행의 합:"+sum);
		}
		for(i=0;i<colsum.length;i++) {
			System.out.println(i+"열의 합:"+colsum[i]);
		}
	}
}
