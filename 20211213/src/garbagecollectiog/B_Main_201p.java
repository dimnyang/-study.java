package garbagecollectiog;

public class B_Main_201p {

	public static void main(String[] args) {
		// 6개 객체생성
		A_item i1 = new A_item(1);
		A_item i2 = new A_item(2);
		i2 = null;
		A_item i3 = new A_item(3);
		// 메모리 중간에 회수하도록 강제명령
		System.gc();
		A_item i4 = new A_item(4);
		i4 = null;
		A_item i5 = new A_item(5);
		i1 = null;
		System.gc();
		A_item i6 = new A_item(6);
		
		

	}

}
