package constructor;

public class C_BasketballPlayer {
	
	
	public int height;
	public int jumpHeight; //변수는 첫단어 첫글자는 소문자, 이후 단어 첫글자는 대문자 나머지는 소문자로 작성하는게 원칙임
	
	
	public C_BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println("생성된 선수 키 : " + height + "점프력 : " + jumpHeight);
		
	
	} public void dunkShoot() {
		if( (height + jumpHeight) > 300 ) {
			System.out.println("덩크슛에 성공했습니다.");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
	
	
	

}
