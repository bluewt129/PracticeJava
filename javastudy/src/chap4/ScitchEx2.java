package chap4;

public class ScitchEx2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1; //1~10 사이의 임의의 수(난수)
		/*
		 *  Math.random() : x
		 *    0 <= x < 1.0 임의의 실수값을 리턴해주는 함수
		 *    0 <= x*10 < 10.0 : 0 ~ 9.9999
		 *    0 <= (int)(x*10) < 10.0 : 0 ~ 9
		 *    0 <= (int)(x*10)+1 < 10.0 : 1 ~ 10
		 */
		System.out.println(num+":");
		switch(num) {
		case 1 : System.out.println("자전거당첨");break;
		case 2 : System.out.println("USB 당첨");break;
		case 3 : System.out.println("마우스 당첨");break;
		default : System.out.println("다음기회에");break;
		
		}

	}

}
