package random1;

import java.util.Random;
import java.util.Scanner;

public class z {

	public static void main(String[] args) {
		// Random 객체 생성한 다음 nextBoolean() 기능을 이용해
				// 동전던지기 카운티이 프로그램을 만들어주세요
				// n화 던졌을때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
				// 프로그램이 다 끝났을때 앞면 몇회, 뒷면 몇회인지 
				// 콘솔에 출력해주세요
				// 실행 횟수 n회는 스캐너로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
        System.out.println("동전을 몇회 던질껀지 입력해주세요.");
        int count = scan.nextInt();
        int front = 0;
        int back = 0;
        
        Random random = new Random();
        for(int i = 0; i < count; i++) {
        	if(random.nextBoolean()) {
        		front ++;
        	}else {
        		back ++;
        	}
        }System.out.println(count + "회 동전던짐");
        System.out.println("앞면이 나온 횟수" + front);
        System.out.println("뒷면이 나온횟수 " + back);
	}

}
