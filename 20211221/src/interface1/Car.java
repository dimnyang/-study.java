package interface1;

// 인터페이스 구현(상속이 아님)
//  extends 대신에 implements을 사용합니다.
// 인터페이스 내부에 추상메서드는 무조건 전부 구현해야 합니다.
public class Car implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Car(String name) {
		this.speed = 0;
		this.gas = MAX_GAS;
		this.name = name;
		
	}

	@Override
	public void accel() {
		// 한번 가속시 속도가 10씩 늘어나도록, 연료는 한번가속에 1씩 소비
		// 단 속도는 200을 초과할 수 없습니다.
		if(speed + CAR_INCREASE_SPD > CAR_MAX_SPD) {
			speed = CAR_INCREASE_SPD;
		}else {
		speed += CAR_INCREASE_SPD;
		}
		gas -=  CAR_DECREASE_GAS ;
		
	}

	@Override
	public void breakSpeed() {
		// 한번 감속시 속도가 10씩 감속, 단 0 미만이 될 수 없다
		
		if (speed - CAR_INCREASE_SPD < MIN_GAS) {
			speed = CAR_INCREASE_SPD;
		}else {
			speed -= CAR_INCREASE_SPD;
		}
		
	}

	@Override
	public void reFul() {
		// 연료는 다시 채울때마다 30씩 채워줍니다.
		// 단 연료 최대값은 상수 MAX_GAS 이용해서 측정해주세요
		if(gas + CAR_INCREASE_GAS > MAX_GAS) {
			gas = MAX_GAS;
		}else {
		gas += CAR_INCREASE_GAS;
		}
}
	

	@Override
	public void showStatus() {
		// 자동차의 정보를 조회할 수 있도록 작성
		
		System.out.println("현재 자동차의 속도 :" + speed + "자동차의 연료량 : " + gas + "자동차의 주인은 : " + name );
		System.out.println("==============");
	}

}
