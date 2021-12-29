package string1;

public class String07 {

	public static void main(String[] args) {
		// toUpperCase()는 문자열 전체를 대문자로 바꿉니다.
		// 대문자였던것은 대문자 유지, 소문자였던것은 대문자로 바뀝니다.
		
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		System.out.println(hello); //일시적으로만 바뀌는것임
		
		//toLowerCase()는 문자열 전체를 소문자로 바꿉니다
		// 소문자는 소문자, 대문자는 소문자로
	
		System.out.println(hello.toLowerCase());
		//영구적용이 아님, 임시적인것

	}
	

}
