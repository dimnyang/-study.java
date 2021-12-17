package polymorphism;

public class Student extends Person {
	
	private int grade;
	
	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("성적 : " + grade);

}
	
	// 신분을 밝히는 코드를 Student 에만 (Person 에는 정의 x) 작성합니다.
	
	public void showStudent() {
		System.out.println("저는 학생입니다.");
	}
}
