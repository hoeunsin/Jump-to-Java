package practice01;

public class pr_equals {
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		System.out.println(a.equals(b));  // true 가 출력 됨
		System.out.println(a.equals(c));  // true 가 출력됨
		System.out.println(a==b);   // true 가 출력
		System.out.println(a==c);   // false 가 출력됨
	}
}


// == 은 두 자료형이 동일한 '객체'인가를 판별할 때 쓰는 연산자임.
// 두 '문자열'이 같은가를 묻고 싶으면, a.equals(b) 를 쓰시오.