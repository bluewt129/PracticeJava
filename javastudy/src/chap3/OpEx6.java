package chap3;

/* 대입연산자
 * lvalue(좌측변수) = rvlaue (우측값 : 변수, 값, 수식)
 * x + y = 100 => 오류
 * x = 100 - y => 정상
 */

public class OpEx6 {

	public static void main(String[] args) {
		int num = 200;
		System.out.println(num);
		num = num + 10; //num 변수값에 10을 더하여 다시 num에 대입
		System.out.println(num);
		num += 10; //num 변수값에 10을 더하여 다시 num에 대입
		System.out.println(num);
		num -= 10; //num  변수값에 10 빼서 다시 num에 대입
		System.out.println(num);
		num *= 2; //num 변수값에 10 곱해서 다시 num에 대입
		System.out.println(num);
		num /= 10; //num 변수값에 10 나눠서 다시 num에 대입
		System.out.println(num);
		num %= 3; //num 변수값을 3으로 나눈 나머지를 다시 num에 대입
		System.out.println(num);
		num += 10 + 5;
		System.out.println(num);
		num *= 2*3;
		System.out.println(num);
		
		byte b = 1;
		b = (byte)(b * 2);

	}
}
