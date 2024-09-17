package chap12;

import java.util.Scanner;

class Chip{
	int chip = 1000;
	Chip(int chip){
		this.chip = chip;
	}
	Chip() {}
}
public class RandomD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chip userchip = new Chip();
		int num = sc.nextInt();
		int ran = 0;
		if(num>=0) {
			ran = (int)(Math.random()*10)+1;
			if(ran==1 || ran==2 || ran==3) {
				System.out.println("돌발!");
				System.out.println("33% 랜덤 이벤트 발생");
				System.out.println("칩을 모두 사용하는 미니게임 등장! 승리시 3배! (현재 칩은 "+userchip.chip+"개 입니다)");
				System.out.println("1을 누르면 미니게임 시작 / 2를 누르면 이벤트 종료");
				String an = sc.next();
				if(Integer.parseInt(an)==1) {
					randompop();
				}else {
					System.out.println("아쉬워요. 다음 이벤트에 참여해주세요!");
				}
			}
		}
	}

	private static void randompop() {
		System.out.println("미니게임을 시작합니다");
		Chip userchip = new Chip();
		
		System.out.println("현재 보유중인 칩은"+userchip.chip+"개 입니다");
		System.out.println("1, 2, 3 중 하나를 선택하세요");
		int raneven = (int)(Math.random()*3)+1;
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if(ch==raneven) {
			System.out.println("당첨! 3배의 칩을 획득합니다!");
			userchip.chip *= 3;
		}else {
			System.out.println("꽝입니다. 모든 칩이 소진됩니다.");
			userchip.chip = 0;
		}
		System.out.println("미니게임 종료");
		System.out.println("남은 칩은"+userchip.chip+"개 입니다.");
		if(userchip.chip == 0) {
			System.out.println("충전시 게임칩 5% 추가 증정 이벤트 진행중! 충전하러 가기=>");
		}
	}
}
