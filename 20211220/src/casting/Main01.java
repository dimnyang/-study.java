package casting;

public class Main01 {

	public static void main(String[] args) {
		Animal c1 = new Cat("나비", 5);
		Animal d1 = new Dog("멍멍이" ,  1);
		Animal a1 = new Animal("기린" , 9);
		
		c1.sit();
		d1.sit();
		a1.sit();
		// d1.tailwag(); // Animal, dog에 동시에 있는것만 접근 가능, dog에만 있는건 접근 불가임
		
		Cat cat = (Cat)c1;
      	cat.grooming();
		// c1은 Anlnal타입이지만, 힙에 저장된 데이터가 Cat이므로, Cat으로 변환 가능
		Dog dog = (Dog)d1;
		dog.tailwag();

	}

}
