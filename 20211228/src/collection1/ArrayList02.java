package collection1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// 여러분들이 직접 String 자료를 가변적으로 받을 수있는
		//ArrayList를 만들어주시고, 자료를
		// 사과, 딸기, 망고, 블루베리, 파인애플을 넣어주세요
		// 자료가 적재된 ArrayList를 콘솔에 적어주세요.
		
		List<String> fruit = new ArrayList<>();
		
		fruit.add("사과");
		fruit.add("딸기");
		fruit.add("망고");
		fruit.add("블루베리");
		fruit.add("파인애플");
		System.out.println(fruit);
		
		// .contains("자료) 는 리스트내에 찾는 자료가 있으면 trus
		// 없으면 false 를 출력해준다.
		System.out.println(fruit.contains("사과"));
		System.out.println(fruit.contains("복숭아"));
		
		// .get(번호) 는 주어진 인덱스에 저장되어 있는 자료를 조회해줍니다.
		System.out.println(fruit.get(1));
		// 없는 인덱스 번호를 입력하면 예외가 발생해 전체 코드가 종료됩니다.
		//System.out.println(fruit.get(10);
		
		// .size() 로 내부 요소 개수를 확인 할 수 있습니다.
		
		System.out.println(fruit.size());
		
		// .isEmpty() 는 비어있는지 체크
		
		System.out.println(fruit.isEmpty());
		
		// 빈리스트 list2를 만들어서 isEmpty()와 .size()를 조회해주세요.
		
		List<String> list2 = new ArrayList<>();
		
		
		System.out.println(list2.isEmpty());
		System.out.println(list2.size());
		
		
		


	
	
	
	
	}

}
