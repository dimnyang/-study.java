package gami.accessmodifier;

public class Warrior extends Commoner{
	

	public Warrior(String name) {
		super(name);
		
		
		}
	  public void doubleAttack() {
		System.out.println("전사가 공격을 시작합니다.");
		setExp(getExp() + 25);
		setHp(getHp() - 4);
	}
	  
		public void hunt() {
			System.out.println("전사가 사냥을 시작합니다.");
	
			setHp(getHp() - 2);
			setExp(getExp() + 10);

}
		
		public void getInfo() {
			System.out.println("현재체력 " + getHp());
			System.out.println("현재마나 " + getMp());
			System.out.println("현재레벨 " + getLv());
			System.out.println("현재경험치 " + getExp());
			System.out.println("현재유저명 " + getName());
			
		}

}
