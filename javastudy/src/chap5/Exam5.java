package chap5;

public class Exam5 {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,2,3,4,5},{10,20},{100}};
		int[] colsum = new int[arr[1].length];
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				colsum[j] += arr[i][j];
			}
			System.out.print(i+"행의 합:"+sum+", ");
		}
		System.out.println();
		for(int i=0;i<colsum.length;i++) {
			System.out.print(i+"열의 합:"+colsum[i]+", ");
		}
	}
}
