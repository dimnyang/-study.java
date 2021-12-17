package overloding;

public class Calculator {
	
	public void plus(int a) {
		System.out.println(a + "에 1을 더한 값은" + (a+1) + "입니다.");
		
	}
	
	public void plus(int a, int b) {
		System.out.println(a + "에 " + b + "을 더한 값은" + ( a+b) + "입니다.");
		
	}
	
	public void plus(double a) { //파라미터 값으로 double a만 요구
		System.out.println( a + "에 0.5를 더한값은" + (a + 0.5) + "입니다.");
	}
	
	public void plus(String asdf) { 
		System.out.println("문자열은 연산 대상이 아닙니다.");
	}

}
