package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		Magicion m1 = new Magicion();
		Archer a1 = new Archer();
		Troll t1 = new Troll();
		Orc o1 = new Orc();
		
		
		o1.doBattle(4);
		m1.huntTroll(t1);
		a1.huntOrc(o1);

	}

}
