package game.Inheritance;

public class Warrior extends Commoner{
	

	
	public int pDam;
	
	//생성자 부분
	public Warrior(String name) {
		super(name);// 다른 코드에 앞서서 무조건 1순위로 들어와야함
		this.pDam =2; // 물리데미지 설정하기.
		
	}
	public void getInfo() {
		System.out.println("현재상태는 레벨 " + lv + ", 체력은 :" + hp +", 마나는 " + mp + ", 아이디는 :" + name +
				", 물리데미지는 " + pDam);
		
	}
	
	
	

}
