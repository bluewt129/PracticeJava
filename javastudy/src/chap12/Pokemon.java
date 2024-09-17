package chap12;

class User{
	int unum;
	String uname;
	String mon;
	User(int unum, String uname){
		this.unum = unum;
		this.uname = uname;
	}
	User(){
	}
}

class Monster extends User{
	User owner = new User();
	String ownername = owner.uname;
	int mnum;
	String orgname;
	String name;
	String type;
	int hp;
	int atk;
	int def;
	int speed;
	String skill;
	Monster(int unum, String uname, int mnum, String orgname, String name, String type, int hp, int atk, int def, int speed, String skill){
		super(unum, uname);
		this.mnum = mnum;
		this.orgname = orgname;
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.skill = skill;
	}
	public static void battle(Monster a, Monster b) throws InterruptedException {
		int ahp = a.hp;
		int bhp = b.hp;
		int satk = 0;
		System.out.println(a.uname+"의 "+a.name+"(이/가) "+b.uname+"의 "+b.name+"에게 싸움을 걸어왔다!");
		Thread.sleep(1000);
		while(ahp>0 || bhp>0) {
			if(a.speed > b.speed) {
				System.out.println(a.name+"의 "+a.skill+"!");
				Thread.sleep(1000);
				bhp = bhp + b.def - a.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					bhp = bhp + b.def - a.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					Thread.sleep(1000);
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
				System.out.println(b.name+"의 "+b.skill+"!");
				Thread.sleep(1000);
				ahp = ahp + a.def - b.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					ahp = ahp + a.def - b.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					Thread.sleep(1000);
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
			}else {
				System.out.println(b.name+"의 "+b.skill+"!");
				Thread.sleep(1000);
				ahp = ahp + a.def - b.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					ahp = ahp + a.def - b.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					Thread.sleep(1000);
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
				System.out.println(a.name+"의 "+a.skill+"!");
				Thread.sleep(1000);
				bhp = bhp + b.def - a.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					bhp = bhp + b.def - a.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
			}
		}
		Thread.sleep(1000);
		System.out.println((ahp>bhp)?a.uname+"의 "+a.name+"승리":b.uname+"의 "+b.name+"승리");
	}
}

public class Pokemon {

	public static void main(String[] args) throws InterruptedException {
		User u1 = new User(1, "지우");
		User u2 = new User(2, "웅이");
		User u3 = new User(3, "바람이");
		User u4 = new User(4, "오박사");
		User u5 = new User(5, "이슬이");
		Monster m1 = new Monster(1, "지우", 1, "피카츄", "피순이", "전기", 115, 100, 50, 130, "백만볼트");
		Monster m2 = new Monster(2, "웅이", 2, "롱스톤", "돌돌이", "바위", 230, 60, 80, 80, "돌떨구기");
		Monster m3 = new Monster(3, "바람이", 3, "윈디", "윈깅이", "바위", 150, 110, 30, 100, "신속");
		Monster m4 = new Monster(4, "오박사", 4, "켄타로스", "돌머리", "바위", 130, 60, 90, 110, "파괴광선");
		Monster m5 = new Monster(5, "이슬이", 5, "아쿠스타", "아쿠", "바위", 120, 55, 95, 100, "물대포");
		Monster.battle(m1, m3);
	}


}
