package structure;

public class I_ClassMain02_196 {

	public static void main(String[] args) {
		
		H_Car c1 = new H_Car();
		
		c1.model = "제네시스";
		c1.price = 150000;
		c1.owner = "최지윤";
		
		H_Car c2 = new H_Car();
		
		c2.model = "bmw";
		c2.price = 150000;
		c2.owner = "고정욱";
		
		c1.getInfo();
		c2.getInfo();

	}

}
