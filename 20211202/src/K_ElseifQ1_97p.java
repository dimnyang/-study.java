import java.util.Scanner;

public class K_ElseifQ1_97p {

	public static void main(String[] args) {
		// 성적 판독기를 만들어보겠습니다.
		// if ~ else if ~else 구문을 사용해 만들어주세ㅛㅇ.
		// 성적기준 95이상 A+, 90이상 A0, 85이상 B+, 80이상 B0
		// 75이상 C+, 70이상 C0, 65이상 D+, 60이상 D0
		// 60미만 F로 프린트구문으로 출력해주세요.
		// 스캐너로 int score 변수에 성적을 입력받습니다.
		// 위에서부터 1번으로 시작함, 만약에 90, 95 , 85 , 80 순이면 씹힘
		
		Scanner scan = new Scanner(System.in);
		System.out.println("고정욱 학생 성적을 입력해주세요.");
		int a = scan.nextInt();
		if ( a >= 90) 
			    System.out.println("A+");
		else if (a >= 90)
			    System.out.println("A0");
		else if (a >= 85)
			    System.out.println("B+");
		else if (a >= 80)
		        System.out.println("B0");
		else if (a >= 75)
		        System.out.println("C+");
		else if (a >= 70)
		        System.out.println("C0");
		else if (a >= 65)
		        System.out.println("D+");
		else if (a >= 60)
		        System.out.println("D0");
		else 
		        System.out.println("F");
     scan.close();
      
	}

}
