
public class M_SwitchCase_101p {

	public static void main(String[] args) {
		// 범위인것처럼 switch~case문을 쓰고 싶다면
		// 하나의 break에 여러 case문을 연달아 작성합니다.
		int score = 10;
		
		switch(score) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
		case 7:
		    System.out.println("우");
		    break;
		case 6:
		case 5:
		    System.out.println("미");
		    break;
		default :
			System.out.println("양");
			
		
		}

	}

}
