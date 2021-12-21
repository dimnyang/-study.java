package final2;

public class Main01 {

	public static void main(String[] args) {
		// final 변수를 쓰기 위한조건
		// 1.Country 라는 소속을 써줘야함
		// 2. .상수명을 적어서 Country에 소속된 상수들을 호출함
		System.out.println(Country.KOREA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		System.out.println(Country.CANADA);
		
		// 값 재할당 불가
		// Countrty.KOREA = 1003;
		
		// Math(수학)
		System.out.println(Math.PI);

	}

}
