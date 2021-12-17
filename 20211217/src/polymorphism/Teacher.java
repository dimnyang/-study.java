package polymorphism;

public class Teacher extends Person {
	
	private String subject;
	
	public Teacher(String name, int age , String subject) {
		super(name, age);
		this.subject = subject;
		
	}
	
	public void showPerson() {
		super.showPerson(); // 프라이빗으로 못가져오기떄문에 부모측 조회메서드 작성
		System.out.println("담당 과목은 : " + subject);

}
	
	public void showTeacher() {
		System.out.println("저는 선생입니다.");
	}

}
