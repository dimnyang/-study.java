package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		Magicion m1 = new Magicion();
		Archer a1 = new Archer();
		Goblin g1 = new Goblin();
		
		g1.doBattle(5);
		a1.huntgoblin(g1);
		

	}

}
