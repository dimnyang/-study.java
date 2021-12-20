package casting;

public class Dog extends Animal{
	
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void tailwag() {
		System.out.println("강아지가 꼬리를 흔듭니다.");
	}
	
	public void sit() {
		System.out.println("강아지가 앉습니다.");

}
}