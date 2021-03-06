package accessmodifier;

public class Warrior {

	// hp, mp, lv, atk, def, exp, name;
	// 선언
	// 변수값은 현실에서도 특정한 물체나 사람의 상태가 휙휙 바뀌지 않으므로
	// 외부에서 값을 함부로 고칠 수 없도록 private로 처리합니다.
	
	private String name;
	private int hp;
	private int mp;
	private int lv;
	private int atk;
	private int def;
	private int exp;
	//private 입력시 같은 패키지도 메인에서 건들 수가 없다
	
	// 생성자 규칙 : 클래스명과 동일한 이름의 메서드를 만들되, 리턴 자료형이 없음
	// 생성자를 만들어주시되, name만 사용자에게 입력받고, 나머지는\
	// 체력 20, 마나 10, 레벨 1, 공격력 3, 방어력 0, 경험치 0 이 되도록 처리해주세요
	
	
	public Warrior (String n) {
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		
		System.out.println("전사 생성완료");
		System.out.println("아이디 : " + name + " , 레벨 : " + hp);
		
		
	}
	//hunt 메서드를 만들어보겠습니다.
	// 이 메서드는 실행시 사냥을 하는데 체력이 2깍이고 경험치가 10올라깁니다.
	// 사냥 결과 체력이 x이 되었고, 누적경험치는 y입니다 라고 출력합니다.
	// 생성자를 비롯한 메서드는 행동을 나타내고
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수)에 의해 결정되며
	// 시도 자체에 대해서는 제한을 두지 않습니다.
	
	public void hunt() {
		hp -= 2;
	    exp += 10;
	    System.out.println("사냥결과 체력이" + hp +"되었고, 누적경험치는" + exp + "입니다.");
	}

}
