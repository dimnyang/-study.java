package thiskeyword;

public class Main_224p {
	
	public static void main(String[] args) {
		// Person을 두명 생성해보시되
		// 생성시 지역간 데이터 교환을 염두에 두고 확인해가면서 생성해보세요.
		// 생성된 Person을 getInfo()를 실행합니다.
		
		Person p1 = new Person("최지윤", 15, 10, "통계학");
		Person p2 = new Person("고정욱" , 20 , 5 ,"경제학");
		
		p1.getInfo();
		p2.getInfo();
		
	}

}
