package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		// person타입으로 생성 및 조회
		Person t1 = new Teacher("최자바" , 20, "국어");
		Person c1 = new Chef("최지윤" , 20, true);
		
		t1.showPerson();
		c1.showPerson();
		

	}

}
