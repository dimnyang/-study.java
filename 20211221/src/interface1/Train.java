package interface1;

public class Train implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = 0;
		this.gas = MAX_GAS;
		this.name = name;
		
	}
	
	

	@Override
	public void accel() {
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
			speed = TRAIN_INCREASE_SPD;
		}else {
			speed += TRAIN_INCREASE_SPD;
		}
		gas -= TRAIN_DECREASE_GAS;
		
	}

	@Override
	public void breakSpeed() {
		speed -= TRAIN_DECREASE_SPD;
		
	}

	@Override
	public void reFul() {
		if(gas +TRAIN_INCREASE_GAS > MAX_GAS) {
			gas = MAX_GAS;
		}else {
			gas += TRAIN_INCREASE_GAS;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("열차의 기관사명 : " +  name + " , 속도 :" + speed + ", 연료 : " + gas);
		
		
	}
	
	

}
