package math1;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임
		// Math.random()을 이용해 1/3 확률로 가위바위 보를 부여받으며
		// 가위 > 보, 바위> 가위, 보 > 가위 상성 가짐
		// 같은 요소 무승부
		// 0 = 가위, 1 = 바위, 2 = 보
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);
		
		// 상수
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		
		if((myValue == SCISSORS && comValue == PAPER)||
		  (myValue == ROCK && comValue == SCISSORS) ||
		  (myValue == PAPER && comValue == ROCK )){
			System.out.println("내가 이겼습니다.");
		}else if(
				(myValue == PAPER && comValue == SCISSORS)||
				(myValue == SCISSORS && comValue == ROCK) ||
				(myValue == ROCK && comValue == ROCK)){
			System.out.println("컴퓨터가 이겼습니다.");
		}else if(myValue == comValue ) {
			System.out.println("무승부입니다.");
			
	}//내가 낸 것과 컴퓨터가 낸것을 숫자에서 문자로 치환해주는 배열
		String[] items = {"가위", " 바위" , " 보"};
		
		System.out.println("내가낸것" + items[myValue]);
		System.out.println("컴퓨터가 낸것 " + items[comValue]);

}
}
