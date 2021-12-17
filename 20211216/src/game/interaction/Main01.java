package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		// 전사를 만들어주세요.
		// 오크를 만들어주세요.
		// 전사의 huntOrc를 호출해주세요
		
		Warrior w1 = new Warrior();
		
		Orc o1 = new Orc();
		w1.huntOrc(o1);

	}
	//프로그램 시작
	//main지역 생성 후 main : 3번에 의해 Worrior 12번으로 이동
	//Warrior: 12~18 실행 후 main: 6 의 우변값을 좌변에 대입
	//main:12 번 에 의해서 Orc 11 로 이동
	//Orc : 11~  16  실행 후  main 12번에 의해 우변값을 좌변에 대입  
	//main13번에 의해 Warrior 27로 이동
	//Warrior 28에 의해 orc에 20으로 이동
	//orc 20~22 실행 후 Warrior 28이동 후 나머지 마저 실행 후
	//main13으로 다시 이동
}
