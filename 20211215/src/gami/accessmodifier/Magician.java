package gami.accessmodifier;
 
public class Magician extends Commoner {
	
	public Magician(String name) {
		super(name);
		
	}
 
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할 수 없다
		// public setter(sethp)를 이용합니다.
		//setHp(5) 인 경우 기존의 값 대신 hp변수에 5로 교체해달라는 요청임
		// 현재 원하는것은 현 hp값에서 사냥할때마다 2씩 체력이 깍이는 것입니다.
		
		setHp(getHp() - 2);
		setExp(getExp() + 10);
		
	}
	// fireball 메서드를 생성해주세요.
	// 마나는 3줄고, 경험치는 20증가합니다.
	
	public void fireball() {
		System.out.println("마법사가 화염구를 던집니다.");
		setMp(getMp() - 3);
		setExp(getExp() + 20);
		
	}
	
	//heal 메서드를 생성해주세요
	// 마나가 2줄고, 체력이 10 회복됩니다.
	
	public void heal() {
		System.out.println("마법사가 회복주문을 외웁니다.");
		setMp(getMp() - 2);
		setHp(getHp() + 10);
	}
	
	
	
	
	
	
	public void getInfo() {
		System.out.println("현재체력 " + getHp());
		System.out.println("현재마나 " + getMp());
		System.out.println("현재레벨 " + getLv());
		System.out.println("현재경험치 " + getExp());
		System.out.println("현재유저명 " + getName());
		
	}

}
