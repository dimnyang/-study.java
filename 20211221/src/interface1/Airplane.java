package interface1;

public class Airplane implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Airplane() {
		this.speed = 0;
		this.gas = 100;
		this.name = "최지윤";
		
		
	}

	@Override
	public void accel() {
		if(speed +  AIRPLANE_INCREASE_SPD  >  AIRPLANE_MAX_SPD ) {
			speed = AIRPLANE_MAX_SPD;
		}else {
			speed += AIRPLANE_INCREASE_SPD;
		}
		
	}

	@Override
	public void breakSpeed() {
		speed -= AIRPLANE_DECREASE_SPD;
		
	}

	@Override
	public void reFul() {
		if(gas + AIRPLANE_INCREASE_GAS > AIRPLANE_MAX_GAS) {
			gas = AIRPLANE_MAX_GAS;
		}else {
			gas +=  AIRPLANE_INCREASE_GAS;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("비행기 기관사명 : " + name + ", 연료량 : " + gas + ", 현재속도는 " + speed);
		
		
	}

}
