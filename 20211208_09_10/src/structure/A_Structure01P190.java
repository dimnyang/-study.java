package structure;

// import java.util.Scanner; // 다른 패키지에서 가져올 수 있음
public class A_Structure01P190 {

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .jave파일에 저장합니다.

		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		B_Person p1 = new B_Person();
		// p1내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "고정욱";
		System.out.println(p1.name);
		p1.age = 20;
		System.out.println(p1.age);
		p1.pNum = "01088626722";
		System.out.println(p1.pNum);
		p1.uNum = 22;
		System.out.println(p1.uNum);
	
		// 또 다른 사람을 하나 만들어봅시다.
		B_Person p2 = new B_Person();
		// p2에도 name, age, pNum, uNum을 부여해서
		// 콘솔에 찍어주세요.
		p2.name = "최지윤";
		System.out.println(p2.name);
		p2.age = 20;
		System.out.println(p2.age);
		p2.pNum = "01025269766";
		System.out.println(p2.pNum);
		p2.uNum = 33;
		System.out.println(p2.uNum);
		
		System.out.println("사람 1의 정보입니다.");
		System.out.println("이름 : " + p1.name + ", 나이 : " + p1.age + ", 연락처 :");
		
	}

}