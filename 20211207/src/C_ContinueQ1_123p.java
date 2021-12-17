import java.util.Scanner;

public class C_ContinueQ1_123p {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int n = scan.nextInt();
		
		int total = 0;
		
		for(int a = 1; a <= n; a++) {
			if(a % 2 == 0) {
				continue;
			} total += a;
		} System.out.println("총합 :" + total);

	}

}
