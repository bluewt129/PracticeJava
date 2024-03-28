package chap6;


public class RectangleEx2 {

	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[5];
		int totArea = 0, totLen = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Rectangle2();
			arr[i].width = (int)(Math.random()*11)+20;
			arr[i].height = (int)(Math.random()*11)+20;
			arr[i].sno = ++Rectangle2.cnt;
			System.out.println(arr[i]);
			totArea += arr[i].area();
			totLen += arr[i].length();
		}
		System.out.println("전체 사각형 넓이 합"+totArea);
		System.out.println("둘레의 합"+totLen);
	}
}
