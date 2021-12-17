package haepmemory;

public class B_StringComparison {
// 문자열은 같은 문자로 저장시 같은 주소를 공유합니다.
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hallo";
		
		
		//일반 변수의 배정 값 조회시 .hashCoda()를 씁니다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		//문자열은 일부분만 변경이 불가능함
		// str[0] = "Q";
		
		// str1 == str2 와 같이 비교하는것은 문자열 비교가 아닌
		// 주소비교이다.
		// new 키워드로 생성시 내용이 같은 문자열도
		// 별개의 공간을 새로 배정해 만듭니다.
		System.out.println(str1 == str2);
		//문자가 동일해서 true가 아닌 주소가 동일한것임
		// 문자열간 비교는 (주소말고 내용물간비교) .equals()로 진행합니다.
		System.out.println(str1.equals(new String("Hello")));
		System.out.println(str1 == new String("Hello"));
		

	}

}
