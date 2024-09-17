package chap5;

public class ArrEx1 {

	public static void main(String[] args) {
		int arr[]; // 1. 배열의 선언. 참조변수 선언.
		arr = new int[5]; //2. 배열 객체의 생성. length 값은 변경할 수 없다 length 는 배열의 갯수
		/*
		 * new 예약어 기능
		 * 1. 객체 생성 : int 값 5개를 저장할 수 있는 변수 할당. length 상수값 설정
		 * 2. 기본값 초기화
		 *		숫자 : 0
		 *		boolean:false
		 *		그 외 : null
		 */
		//3. 배열의 초기화. 인덱스로 접근. 인덱스 값은 0부터 시작한다.
		arr[0] = 10;
		arr[1] = 20;
		//4. 배열값 조회
		// arr.lenth : 배열값의 갯수 저장
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
		int arr2[] = new int[3];
		arr2[0] = 100;
		arr2[1] = 200;
		for(int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("===");
		arr2 = arr;
		for(int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println(333);
		arr[3]=500; // 참조값이 같이 때문에 arr2 값을 변경하지 않았어도 arr2[3]에도 500이 출력된다
		for(int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("개선된 for 구문으로 조회(forEach라고도 함)");
		//개선된 for 구문
		//인덱스(첨자) 사용 안됨 : 요소의 값만 조회할 수 있다
		//인덱스를 사용할 필요가 있는 경우 기존의 for문으로 구현해야한다
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
