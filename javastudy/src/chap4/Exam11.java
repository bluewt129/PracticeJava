package chap4;

public class Exam11 {

	public static void main(String[] args) {
		
		for(int i1=2;i1<10;i1++) {
			System.out.print(i1+"단\t");
		}
		System.out.println();
		for(int j=2;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				System.out.print(i+"*"+j+"="+(j*i)+"\t");
		     }
		     System.out.println();
	    }
	}
}
