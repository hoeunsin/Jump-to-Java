package practice01;

import java.util.HashMap;

public class ch_03_9_Map {
	public static void main(String[] args) {
		// Map 은  파이썬의 딕셔너리 같이 key 와 value를 1대1 대응 시키는 자료형
		// 순차적인 자료 아님. 따라서 index 로 값을 찾을 수 없음
		// key 로 value를 찾는 것임.
		// Map은 인터페이스이다.
		// Map 인터페이스를 구현하는 Map 자료형에는 HashMap, LinkedHashMap, TreeMap 등이 있다.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball",  "야구");
		
		// key 값에 해당하는 value를 얻기 위해서는 get 메소드로
		System.out.println(map.get("people"));
		
		// containsKey 메소드
		// Map 에 해당 key 가 있는 지 확인
		// 있으면 true, 없으면 false
		System.out.println(map.containsKey("baseball"));
		
		// remove 메소드
		// Map 의 항목 삭제하는 메소드
		// 삭제하고 삭제한 value 값을 return 함.
		System.out.println(map.remove("people"));
		System.out.println(map.containsKey("people"));
		
		// size 메소드
		// map 에 몇개의 항목이 있는지 리턴함.
		System.out.println(map.size());
	}
}
