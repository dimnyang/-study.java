package constructor;

public class B_Main01_204p {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어 주세요.
		
		A_Car c1 = new A_Car(100, 0, "채종훈");
		c1.gas = 100;
		c1.speed = 0;
		c1.owner = "최지윤";
		
		// 차를 뽑자마자 먼저 상태 확인
		
		c1.getInfo();
		
		// 엑셀 두번 밝기
		
		c1.accelspeed();
		c1.accelspeed();
		
		c1.getInfo();
		
		c1.breakspeed();
		
		c1.getInfo();
		
		c1.putGas();
		c1.getInfo();

	}

}
