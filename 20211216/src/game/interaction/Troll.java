package game.interaction;

public class Troll extends Warrior{
	
	private int hp;
	private int mp;
	private int atk;
	private int def;
	
	
	public Troll() {
		this.hp = 5;
		this.atk = 5;
		this.def = 2;
		
	}
	
	public void Trollatk(int uAtk) {
		
		hp = (hp + def) - uAtk;
		if(hp <= 0) {
			hp =0; // 0미만으로 안내려가게 0으로 보정
			System.out.println("트롤이 죽어서 교전이 끝납니다.");
			return; 
		  // 매서드 강제종료
		}
		System.out.println("트롤의 남은체력은 " + hp);
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
