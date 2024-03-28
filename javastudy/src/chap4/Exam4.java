package chap4;

public class Exam4 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("for짝수의 합 :"+sum);
		
		sum = 0;
		
		for(int i=2;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("for2 짝수합:"+sum);
		
		sum = 0;
		int i = 1;
		while(i<=100) {
			if(i%2==0) {
			sum += i;
			} i++;
		}
		System.out.println("while 짝수의 합 :"+sum);
		
		sum = 0;
		i = 1;
		
		do {
			if(i%2==0) sum +=i;
			i++;
		}while(i<=100);
		System.out.println("dowhile : "+sum);		
	}
  }

