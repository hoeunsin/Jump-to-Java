package practice01;

public class ch_03_6_Array {
	public static void main(String[] args) {
		// int[] odds = {1,3,5,7,9}; // 벡터 같은 것. 자료형의 집합 한가지 종류의
		
		String[] weeks = {"월","화","수","목","금","토","일"};  // 문자열의 배열 만드는 법
		System.out.println(weeks[3]);
		
		String[] weeks2 = new String[7];  // 초기값 없이 배열 변수 만들 때는 길이를 정해주어야만 한다.
		weeks2[0] = "Mon";
		weeks2[1] = "Tue";
		weeks2[2] = "Wed";
		weeks2[3] = "Thu";
		weeks2[4] = "Fri";
		weeks2[5] = "Sat";
		weeks2[6] = "Sun";
		
		System.out.println(weeks2[3]);
		System.out.println(weeks.length);
		for (int i=0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}
}
