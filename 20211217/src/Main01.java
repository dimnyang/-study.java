
public class Main01 {

	public static void main(String[] args) {
		
		Seller s1 = new Seller(10, 2);
		Buyer b1 = new Buyer(10000000);
		
		s1.sellMango(10);
		s1.sellApple(10);
		b1.buyMango(s1, 4000);
		b1.buyApple(s1, 2000);
		

	}

}
