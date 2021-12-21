package interface1;

public class Main02 {

	public static void main(String[] args) {
		
		Vehicle t1 = new Train("최지윤");
		
		t1.accel();
		t1.breakSpeed();
		t1.showStatus();
		t1.reFul();
		t1.reFul();
		t1.showStatus();

	}

}
