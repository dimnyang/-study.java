package polymorphism;

public class Chef extends Person{
	
	private boolean korean;
	
	public Chef(String name, int age, boolean korean) {
		super(name, age);
		this.korean = korean;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("한식 : " + korean);

}
	
	public void showChef() {
		System.out.println("저는 요리사입니다.");
	}

}
