package chap4;

public class LoopEx7 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum>1000) {break;}
		}System.out.println(i+":"+sum);
	}
}