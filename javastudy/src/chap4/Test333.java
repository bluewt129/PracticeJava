package chap4;

import java.util.Scanner;

public class Test333 {

	    public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int h, m, mm;
	        h = sc.nextInt();
	        m = sc.nextInt();
	        mm = sc.nextInt();
	        
	        h += mm / 60;     // 요리시간이 60분 이상이면 넘는 만큼 h에 더하고
	        m += mm % 60;    // 남은 분을 m에 더한다.
	        
	        if(m >= 60) {
	            h += 1;        // m이 60 이상이면 h 를 한시간 더하고 
	            m -= 60;    // m은 60을 - 한다.
	        }
	        
	        if(h >= 24) {    // h가 24시 이상이면 24를 빼준다 (24시는 0시로 표기하기 때문)
	            h -= 24;
	        }
	        System.out.println(h + " " + m);
	    }
	}
