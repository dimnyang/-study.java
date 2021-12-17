package game.Inheritance;

public class Magician extends Commoner {
	
	public int mDam;
	
	public Magician(String name) {
		super(name);
		this.mDam = 2;
	}
	
	public void getInfo() {
		System.out.println("현재상태는 레벨 " + lv + ", 체력은 :" + hp +", 마나는 " + mp + ", 아이디는 :" + name +
				", 물리데미지는 " + mDam);
		
	}
	

}
