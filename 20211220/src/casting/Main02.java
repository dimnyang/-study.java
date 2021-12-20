package casting;

public class Main02 {

	public static void main(String[] args) {
		
		Animal a = new Cat("만두" , 5);
		// a 변수와 연결된 heap 쪽 자료가 Cat인지 확인
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);

	}

}
