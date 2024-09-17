package test0319;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		System.out.println("신장을 입력하세요"); 
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		System.out.println("=== 탈 수 있는 놀이기구 ===");
		System.out.println("동화극장");    
		if(height >= 100){      
			System.out.println("회전목마");      
			if(height >= 120){        
				System.out.println("범퍼카");      
			}    
		}
	}
}
