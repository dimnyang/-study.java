package polymorphism;

public class Main01 {

	public static void main(String[] args) {
		
		Person p1 = new Person("최지윤" , 20);
		Person s1 = new Student("고정욱" , 20, 100);
		
		// p1, s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson(); // Person 측 showPerson() 호출
		s1.showPerson(); // Stydent 측 showPerson() 호출
		
		// s1은 Person 타입이므로 person에 소속된 자원만 호출할 수 있습니다.
		// s1.showStudent(); // 호출안됨
		

	}

}
