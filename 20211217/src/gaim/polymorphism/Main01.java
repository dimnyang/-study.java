package gaim.polymorphism;

public class Main01 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("최게임");
		Monster o1 = new Orc();
		
		c1.hunt(o1);
		o1.doBattle(2);
		
		
		

	}

}
