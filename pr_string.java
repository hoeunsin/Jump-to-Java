package practice01;

public class pr_string {
	public static void main(String[] args) {
		String a = "Happy Java";
		String b = "a";
		String c = "123";
		
		// 아니면 new를 앞에 만들면 된다. new는 객체를 만들 때 사용한다.
		
		String d = new String("Happy life");
		String e = new String("A");
		String f = new String("234");
		
		// int, long, double, float, boolean, char 등을 primitive(원시형) 자료형이라 불ㄴ다.
		// primitive(원시형) 자료형은 new 로 생성할 수 없다.
		// primitive 자료형은 아래와 같이 리터럴(literal)로 표기가 가능하다.(new나 다른 작업을 하지 않고 바로 입력할 수 있다는 뜻 같다.)
		
		boolean result = true;
		char capitalC = 'C';
		int i = 100000;
		
		// String 은 liter 처럼 new라고 객체임을 알리지 않고 쓰지만,
		// primitive 자료형인 것은 아니다.
		
	}
}
