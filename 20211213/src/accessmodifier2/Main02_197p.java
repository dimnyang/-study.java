package accessmodifier2;

import accessmodifier.Warrior;

public class Main02_197p {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("고정욱천사전사");
		
		// w1.hp = 10000000;
		// 다른 패키지는 public 작성이 안되면 에러가 난다.
		 //패키기자 달라서 hp변경 불가
		w1.hunt();
		w1.hunt();
		w1.hunt();

	}

}
