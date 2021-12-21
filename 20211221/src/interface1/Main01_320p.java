package interface1;

public class Main01_320p {

	public static void main(String[] args) {
		// 인터페이스의 경우는 멤버 변수가 따로 없고
		// 모든 메서드를 다 오버라이딩 해야하기 때문에
		// 부모 타입에서 자식쪽의 기능을 실행하려 할 떄
		// 기본적으로 부모쪽에서 정의한 내용을 실행하는데 제약이 없습니다.
		// 다형성 원리는 기본적으로 알고계신대로 적용됩니다.
		Vehicle v1 = new Car("최지윤");
		v1.accel();
		v1.accel();
		v1.showStatus();
		v1.breakSpeed(); 
		v1.showStatus();
		v1.reFul();
		v1.showStatus(); 
		

	}

}
