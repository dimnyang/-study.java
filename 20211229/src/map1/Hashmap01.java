package map1;

import java.util.HashMap;
import java.util.Map;

public class Hashmap01 {

	public static void main(String[] args) {
		// Map 인터페이스의 대표 구현체는 HashMap입니다.
		// 제네릭 내부에는 < Key 자료형, Value자료형> 으로 작성합니다
		Map<String, String> map = new HashMap<>();
		map.put("최지윤" , " 자바");
		map.put("코로나" , " 백신");
		map.put("최개발" , " jsp");
		System.out.println(map);
		
		
		// 자료조회시는 .get(Key값)으로 조회합니다.
		// map은 키로 벨류를 조회하는건 가능하지만, 벨류로 키를 조회하는건 불가
		// 없는 키값으로 조회화면 null이 나온다
		// 인덱스 번호도 없습니다.
		System.out.println(map.get("최지윤"));
		System.out.println(map.get("최지인"));
		System.out.println(map.get("자바"));
		
		//remove는 key를 이용해서 key = value 전체를 삭제합니다.
		map.remove("코로나");
		System.out.println(map);
		
		// .size() 는 크기를 알려줍니다. 정수로 몇개의 key = value 쌍이
		// 저장되어있는지 확인 할 수 있습니다.
		System.out.println(map.size());
		

	}

}
