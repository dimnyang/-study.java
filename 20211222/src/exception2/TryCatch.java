package exception2;

public class TryCatch {

	public static void main(String[] args) {
		
		
		String[] name = {"김자바", "제이에서피", "박스프링"};
		
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println(name[i]);
			}
			System.out.println("이상 모든 학생 목록입니다.");
		}catch (Exception e) {
			System.out.println("더 이상 학생이 없는데 초과 인덱스를 조회했습니다.");
			
		}finally {
			System.out.println("집계가 끝났습니다.");
		}

	}

}
