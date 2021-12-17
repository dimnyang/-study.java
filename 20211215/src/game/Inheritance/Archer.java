package game.Inheritance;

public class Archer extends Commoner {
	
	public int rDam;
	
	public Archer(String name) {
		super(name);
		this.rDam = 2;
		
	}
	
	
	public void getInfo() {
		System.out.println("현재상태는 레벨 " + lv + "체력은 :" + hp +",마나는 " + mp + "아이디는 :" +
	      name + "원거리 데미지는 " + rDam);
		
		
	}


}
