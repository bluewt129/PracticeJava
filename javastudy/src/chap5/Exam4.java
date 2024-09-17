package chap5;

public class Exam4 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("수");
			return;
		}
		int sum = 0;
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
			for(int j=0;j<args[i].length();j++) {
				sum += args[i].charAt(j) - '0';
			}
		}
		System.out.println("합:"+sum);
		sum = 0;
		for(int i=0;i<args.length;i++) {
			for(int j=0;j<args[i].length();j++) {
				sum += args[i].charAt(j) - '0';
				System.out.print(args[i].charAt(j)+((i==args.length-1 && j==args[i].length()-1)?"=":"+"));
			}
		}
		System.out.println(sum);

	}

}
