package game.interaction;

public class Archer {
	
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	
	public Archer() {
		this.hp = 30;
		this.mp = 20;
		this.atk = 14;
		this.def = 1;
		this.exp = 0;


}
	
	public void huntOrc(Orc orc) {
		orc.doBattle(this.atk);
		this.hp = this.hp + this.def - orc.getAtk();
		System.out.println("교전 결과 궁수의 체력 : " + this.hp);
		
		
	}
	public void huntTroll(Troll troll) {
		troll.Trollatk(this.atk);//트롤을 전사가 공격하는 로직
		if(troll.getHp() > 0 ) { // 트롤 체력이 0보다 크다면
			this.hp = this.hp + this.def - troll.getAtk(); // 정상교전 진행
			System.out.println("교전 결과 궁수의 체력 : " + this.hp);
			
		}else { // 0보다 작거나 같다면
			System.out.println("트롤이 죽어서 반응하지 않습니다.");
		}
	}
		public void huntgoblin(Goblin goblin) {
			goblin.doBattle(this.atk);
			if(goblin.getHp() > 0) {
				this.hp = this.hp + this.def - goblin.getAtk();
				System.out.println("교전 결과 궁수의 체력 : " + this.hp);
			}else {
				System.out.println("고블린이 죽어서 반응하지 않습니다.");
			}
	
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
}

