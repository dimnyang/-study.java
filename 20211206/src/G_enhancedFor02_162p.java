
public class G_enhancedFor02_162p {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 명칭으로 array를 만들어 담아주신 다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		// 콘솔창에 출력해주세요.
		
		int [] math = {96, 23, 52, 82, 72, 31, 58};
		int [] eng = {62, 42, 68, 31, 80, 77, 45};
		int [] com = {10, 28, 39, 74, 65, 90, 98};
		
		int total = 0;
		
		for (int score : math) {
			System.out.println(score);
			total += score;
		
			System.out.println("수학평균 : " + total/math.length);
			
	   for(int i = 0; i < eng.length; i++) {
	    	total += eng[i];
	    } System.out.println("영어평균 : " + total/eng.length);
		
		 //int total = 0;
		
		total = 0;
		
		for(int i : com ) {
			total += i;
		} 
		System.out.println("컴퓨터평균 : " + total/com.length);
		
			
   

	}

}
}