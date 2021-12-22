package exception2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("1번 정수를 입력해주세요");
      int a  = scan.nextInt();
      System.out.println("2번 정수를 입력해주세요");
      int b = scan.nextInt();
      
      if(b == 0) {
    	  System.out.println("0으로 숫자를 나눌 수 없습니다.");
      }else {
    	  System.out.println(a/b);
      }

	}

}
