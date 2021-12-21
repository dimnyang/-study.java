package abstract1;

public class Child extends Parent{
	
	// new 키워드로는 추상클래스를 생성 할 수 없습니다.
	// Parent p1 = new Parent();
	
	// 단 Parent를 상속받아 getAge 메서드로 구체화시킨
	//Child타입으로는 객체 생성 및 사용이 가능합니다.
	
	Parent c = new Child();

	@Override
	public void getAge() {
		System.out.println("부모쪽 나이는 private입니다.");
		
	
	
	
	}	 
}
