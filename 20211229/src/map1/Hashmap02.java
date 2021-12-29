package map1;

import java.util.HashMap;
import java.util.Map;

public class Hashmap02 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요
		// key는 음식이름, value는 가격(정수)로 저장헤주세요
		// 메뉴는 5개 이상, 집어넣어주세요
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> food = new HashMap<>();
		food.put("김밥", 2000);
		food.put("순대", 3000);
		food.put("떡볶이", 5000);
		food.put("오뎅", 500);
		food.put("튀김", 4000);
		
		System.out.println("김밥 가격 :" + food.get("김밥"));
		System.out.println("순대 가격 :" + food.get("순대"));
		System.out.println("튀김 가격 :" + food.get("튀김"));
		
		
		

	}

}
