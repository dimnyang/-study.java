package interface1;

//인터페이스는 interface 선언을 사용합니다.
// 내부에는 상수인 값과, 추상메서드만 선언할 수 있습니다.
// 애초에 구현(implements)을 전제로 설계되기 떄문에
// 일반 변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성에는 부모클래스의 역할을 합니다.
public interface Vehicle {
	
	// 최대 연료량
	// 바로 상수로 잡힙니다maximum minimum
	int MAX_GAS = 100;
	int MIN_GAS = 0;
	
	int CAR_MAX_SPD = 200;
	int CAR_INCREASE_SPD = 10; // 증가
	int CAR_DECREASE_SPD = 2;
    int CAR_DECREASE_GAS = 10; //감소
    int CAR_INCREASE_GAS = 10;
   
 
    

	int TRAIN_MAX_SPD = 400;
	int TRAIN_INCREASE_SPD = 70; // 증가
	int TRAIN_DECREASE_SPD = 7;
    int TRAIN_DECREASE_GAS = 50; //감소
    int TRAIN_INCREASE_GAS = 50;
    
    
    int AIRPLANE_MAX_GAS = 1000;
	int AIRPLANE_MAX_SPD = 900;
	int AIRPLANE_INCREASE_SPD = 400; // 증가
	int AIRPLANE_DECREASE_SPD = 300;
    int AIRPLANE_DECREASE_GAS = 150; //감소
    int AIRPLANE_INCREASE_GAS = 500;
    
	
	// 탈것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	// {
	//    실행문...
	// }
	// 와 같은 실행문 부분(메서드의 body) 없이 선언만 해 주세요
	
	public void accel(); // 가속
	public void breakSpeed(); // 감속
	public void reFul(); // 주유
	public void showStatus(); // 계기판 조회
	

}
