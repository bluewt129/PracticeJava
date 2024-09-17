package chap4;

public class LoopEx2 {

	public static void main(String[] args) {
		System.out.println("for 구문으로 출력");
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i; //sum에 i값을 더해서 대입하라는 의미. 1번 루프에서 sum은 1 2번 루프에서 sum은 3 ... 10번은 55
		}
		System.out.println("합계:"+sum); //10번의 반복 후 11번째부터는 거짓이기 때문에 for문 밖으로 나오게된다
		
		sum = 0;
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("합계:"+sum);
		
		sum = 0;
		i = 1;
		do{
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("합계:"+sum);
		

	}

}
