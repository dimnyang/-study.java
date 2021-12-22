package exception2;

import java.util.Scanner;

public class TryCatch2_353p {
	public static void main(String[] args) {
		

	// 아까 exception1 패키지 내부의 여러 예외 유형중
	// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
	// 발생할 예외에 대한 처리는 try_catch 블록을 활용합니다.
	//  / by zero(0으로나누기) 에 대한 처리 허용하지 않습니다.
	
	Scanner scan = new Scanner(System.in);
    System.out.println("문자열을 입력해주세요");
	String a = scan.nextLine();
	
	
	try {
		int result = Integer.parseInt(a);
		System.out.println(result);
		System.out.println("출력 완료");
	}catch (Exception e) {
		
		System.out.println("출력할 수 없습니다.");
	}finally {
		System.out.println("실행 끝!");
	}

}
}