package chap4;
/*
 *  반복문 : 조건문의 결과가 참인 동안 {} 내부의 문장들을 반복 수행
 *  		반복문의 끝을 만나면 자동으로 반복문의 처음으로 제어가 이동됨.
 *  		조건문의 결과가 거짓인 경우 반복 종료
 */
public class LoopEx1 {

	public static void main(String[] args) {
		//1~5까지 숫자 출력하기
		System.out.println("for 구문을 이용하여 1~5까지 출력하기");
		/*
		 *  1. int i = 1 : 초기화. i 변수는 for 구문 내부에서만 사용 가능한 지역변수.
		 *  2. i <= 5 : 조건문. 조건문이 참인 경우만 반복 실행. 거짓인 경우 반복 종료.
		 *  3. System.out.print(i); 실행
		 *  4. i++ : 증감식.
		 *  5. 2번의 조건식 실행
		 */		
		for(int i=1;i<=5; i++) {
			System.out.print(i);
			
		}
		/*
		 * int i = 1; : 초기화
		 * 1. (i<=5) : 조건문 참인 경우 {} 내부 문장 실행. 거짓인 경우 반복문 종료.
		 * 2. System.out.print(i);i++; : 문장들 실행
		 * 3. 1번의 조건문 실행
		 */
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		/*
		 * 1. System.out.print(i);i++; : 문장들
		 * 2. while (i<=5) : 조건문 => 참이면 문장들을 다시 실행. 거짓이면 반복 종료.
		 */
		
		i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		System.out.println("i="+i);		
	}
}
