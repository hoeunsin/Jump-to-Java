package practice01;

import java.util.ArrayList;

public class ch_03_7_List_01_add {
	public static void main(String[] args) {
		// Array는 길이가 정해져 있다. 처음 10개로 만들어졌거나, 길이가 10개로 정해졌다면, 그 이상 데이터를 잡을 수 없다.
		// List는 자료형 개수가 가변이다.
		// List 자료형에는 ArrayList, LinkedList 등이 있다.
		
		ArrayList<String> pitches = new ArrayList<String>();  // ArrayList의 자료형이 무엇인지 표시
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		System.out.println(pitches.get(1));  // List에서 특정 인덱스 값을 알고 싶으면 get 메소드 사용 
		
		System.out.println(pitches.size());  // List의 갯수 알고 싶으면 size 메소드 사용.
		
		System.out.println(pitches.contains("142"));  // 안에 해당 항목 있는지 물어보는 것. 있으면 boolean t, f로 리턴
		
		System.out.println(pitches.remove("129"));  // 항목 또는 객체를 제거하라고 하면, true false 로 리턴하고
		 
		System.out.println(pitches.remove(0));  // 인덱스로 제거하면, 인덱스에 있는 항목을 삭제하고 리턴함.
		
		
	}
}
