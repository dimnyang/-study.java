package casting;

public class Cat extends Animal {
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void grooming() {
		System.out.println("고양이가 그루밍을 합니다.");
	}
	
	public void sit() {
		System.out.println("고양이가 앉습니다.");

}
}