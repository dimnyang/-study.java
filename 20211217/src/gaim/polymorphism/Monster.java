package gaim.polymorphism;

// 몬스터 생성
// name, hp, mp, atk
public class Monster {
	
	private String name;
	private int hp;
	private int atk;
	
	public Monster(String name, int hp,int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	public void doBattle(int Uatk) {
		this.hp = this.hp - Uatk;
		if(this.hp <= 0) {
			System.out.println(this.name + "이/가 0이되어 교전이 불가능합니다.");
			return;
		}else {
			System.out.println(this.name + "이/가 공격 받았습니다, 교전 후 몬스터의 남은체력 :" + this.hp);
			
			}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}
