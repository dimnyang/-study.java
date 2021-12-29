package stringbuilder1;

// 다음 문자열ㄹ의 문자를 0번부터 시작해서 3번째마다 삭제해주세요

public class Bulider05 {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
	for(int i = 0; i < a.length(); i++) {
		if(i % 3 == 0) {
			a.deleteCharAt(i);
		}
	}
	
	System.out.println(a);
	}
}
