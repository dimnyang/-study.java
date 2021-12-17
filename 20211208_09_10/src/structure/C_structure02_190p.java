package structure;

public class C_structure02_190p {

	// Person 내부의 정보를 쉽게 조회하기 위한 매서드 생성
	public static void getInfo(B_Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 :" + p.name );
	}
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		B_Person a = new B_Person();
		a.name ="고정욱";
		a.age = 20;
		a.pNum = "010-1234-5678";
		a.uNum = 32;
		
		B_Person b = new B_Person();
		b.name = "김자바";
		b.age = 24;
		b.pNum = "010-1453-5258";
		b.uNum = 45;
		
		getInfo(a); // a의 주소값을 getInfo의 p에 전달
		getInfo(b); // b의 주소값을 getInfo의 p에 전달
		
	}
}
