package gaim.polymorphism;

// 속성 값으로 name, hp, mp, atk를 추가해주세요.
// 생성자로 위 필드를 초기화하도록 설정해주세요.
// 다형성을 적용해서 어떤 몬스터가 오더라도 이 메서드 하나로 처리함.
//몬스터의 doBattle을(사용자 공격력) 을 호출해서 몬스터의 체력을 깍아주세요
//오크가 반격 가능한 상태인지 먼저 검사
// 몬스터의 공격력을 받아와 사용자의 체력을 깍아주세요


public class Commoner {
	
	private String name;
	private int hp;
	private int mp;
	private int atk;
	
	public Commoner(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
	}
	public void hunt(Monster monster) {
		monster.doBattle(this.atk);
		if(monster.getHp() > 0) {
		this.hp = this.hp - monster.getAtk();
		
		System.out.println("교전 결과 " + this.name + "의 체력은 " + this.hp);
		
		
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

	
}
