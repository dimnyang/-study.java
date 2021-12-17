package game.Inheritance;

public class Commoner {
	
	protected int lv;
	protected int hp;
	protected String name;
	protected int mp; 
	
	// 생성자 부분
	public Commoner(String n) {
		this.lv =1;
		this.hp = 20;
		this.name = n;
		this.mp = 10;
		// this는 대체로 붙여줌
	}
	
	public void getInfo() {
		System.out.println("현재상태는 레벨 " + lv + "체력은 :" + hp +",마나는 " + mp + "아이디는 :" + name );
		
		
	}

}
