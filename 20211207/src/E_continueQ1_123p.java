 import java.util.Scanner;

public class E_continueQ1_123p {

	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되홀수끼리만 더한
		//총합을 구하는 구문을 작성해주세요.
		// coutinue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 정수를 입력해주세요.");
		int goal = scan.nextInt();
		
		int total = 0;
		int count = 0;
		
		while(count < goal) {
			count += 1;
		
		if(count % 2 == 0) { //홀수면 1로 나누면됨{
			   continue;
		}
			total += count;
			System.out.println("현재 1부터 " + count + "까지 더했습니다.");
			System.out.println("총합은 " + total + "입니다.");
	}	}

	}

