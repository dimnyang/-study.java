package game.interaction;

public class Orc {

	private int hp;
	private int mp;
	private int atk;
	private int def;
	
	
	public Orc() {
		this.hp = 5;
		this.atk = 3;
		this.def = 0;
		
	}
	
	// doBattle 은 유저 공격력을 받아 오크의 체력을 차감합니다.
	// Orc의 체력을 유저 공격력 만큼 차감시켜주세요
	public void doBattle(int uAtk) {
		hp = (hp + def) - uAtk;
		if(hp <=  0) {
			hp = 0;
			System.out.println("오크가 죽어서 교전이 끝납니다.");
			return;
		}
	 
	  System.out.println("오크의 남은 체력 : " + hp);
		
		
	}
	


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}
	
	
	
}
