package chap5;

public class ArrEx2 {

	public static void main(String[] args) {
		//배열의 선언, 생성, 초기화를 한번에
		int[] arr = {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		//생성, 초기화 (이미 arr 객체가 있는 경우에 사용)(이때 int[] 중괄호 안에 숫자 금지)
		arr = new int[] {100,200,300};
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
}
