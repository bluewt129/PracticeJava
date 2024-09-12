package chap3;

public class OpEx4 {

	public static void main(String[] args) {
		int x = 1, y = 1;
		System.out.println(x+"=="+y+":"+(x==y));
		System.out.println(x+"!="+y+":"+(x!=y));
		System.out.println(x+">="+y+":"+(x>=y));
		System.out.println(x+">"+y+":"+(x>y));
		System.out.println(x+"<="+y+":"+(x<=y));
		System.out.println(x+"<"+y+":"+(x<y));
		
		String str = null;
		if(str==null || str.equals("")) {
			System.out.println("str 변수에 값이 없음");
		}

	}

}
