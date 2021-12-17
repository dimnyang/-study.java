package overloding;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요
		// 하나는 시급을 15000원으로 해주시고
		// 다른하나는 입력없이 생성해주세요.
		//p에 최저시급보다 적은 금액이 들어올 경우, 최저시급으로 강제로
		// 보정하는 로직을 추가해주세요
		
		parttimer p1 = new parttimer(false, 15000, "아웃백" , "최지윤");
		parttimer p2 = new parttimer(true, "투썸" , "최지윤");
		parttimer p3 = new parttimer(true, 1000, "투썸" , "최지윤");
		
		
		

	}

}