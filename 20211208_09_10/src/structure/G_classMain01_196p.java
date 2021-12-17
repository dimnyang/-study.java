package structure;

public class G_classMain01_196p {
	        // PersonClass의 메서드는 작성할 필요가 없습니다.
			// 이미 PersonClass의 내부에 필요한 메서드를
	       //다 작성해놧기 때문입니다.
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.

		
		F_PersonClass p1 = new F_PersonClass();
		
		p1.name = "최지윤";
		p1.age = 24;
		p1.pNum = "01011111111";
		p1.uNum = 1;
		p1.glasses = true;
		
		F_PersonClass p2 = new F_PersonClass();
		
		p2.name = "고정욱";
		p2.age = 26;
		p2.pNum = "01011111234";
		p2.uNum = 2;
		p2.glasses = false;
		
		p1.getInfo();
		p2.getInfo();
		
		
		
		
		
		
	}

}
