package practice01;

import java.util.ArrayList;

public class ch_03_8_Generics {
	public static void main(String[] args) {
		// Generic은 ArrayList 뒤에다 쓰는 것.
		// 그냥 객체를 만들면, Object 자료형으로 되는데, generic 을 쓰면, 처음부터 자료형 고정.
		// generic 없이 객체를 만들면,
		// 값을 가져올 경우에는 String으로 (casting)으로 자료형을 변환해서 가져와야 함.
		ArrayList aList = new ArrayList();
		aList.add("hello");
		aList.add("java");
		
		String h1 = (String) aList.get(0);
		String j1 = (String) aList.get(1);
		
		
		ArrayList<String> bList = new ArrayList<String>();
		bList.add("hello");
		bList.add("java");
		
		String h2 = bList.get(0);
		String j2 = bList.get(1);
		
		System.out.println(h1);
		System.out.println(j1);
		System.out.println(h2);
		System.out.println(j2);
		
		
	}
}
