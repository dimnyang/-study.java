package accessmodifier;

public class Main_197p {

	public static void main(String[] args) {
		
		// 전사를 하나 만들고, 사냥을 3번 하세요.
		
		Warrior w1 = new Warrior("고정욱천사전사");
		 
		// w1.hp = 10000000;
		// 이게 출력되는 문제가 있기때문에 main에서 고쳐지는걸 막는게 필요하다.
		// private 요소 hp는 main 지역에서 직접 값 못바꿈
		
		w1.hunt();
		w1.hunt();
		w1.hunt();
		

	}

}
