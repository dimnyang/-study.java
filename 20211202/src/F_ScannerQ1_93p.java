import java.util.Scanner;

public class F_ScannerQ1_93p {

	public static void main(String[] args) {
		// 환율 계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won 변수에 원화 금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 XXXXX원을 환전시 XXXX(화폐) 입니다. 로 결과물을 출력해주세요
		
		Scanner scan = new Scanner(System.in);
	
		double rate = 42.27;
		System.out.println("대만 달러의 환율은 " + rate + "입니다.");
		System.out.println("원화를 입력해주세요");
		int won = scan.nextInt();
		
		System.out.println("원화 " + won + "원을 대만 달러로 환전시");
		System.out.println(won / rate + "ntd입니다.");
		// 다 사용한 scan변수는, .close()로 닫아줘야 메모리가 회수됩니다.
		scan.close();
	

	
}
}