package gaim.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		
		Commoner c1 = new Commoner("최지");
		Monster m1 = new Troll();
		Monster m2 = new Hulk();
        Monster m3 = new Devil();
        
        c1.hunt(m1);
        m1.doBattle(2);
        c1.hunt(m2);
        m2.doBattle(7);
        c1.hunt(m3);
        m3.doBattle(5);
        
        

	}

}
