package practice01;


public class ch_03_5_StringBuffer_01_append {
	// StringBuffer 는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  // StringBuffer 아무것도 없이. 객체로 선언. 나중에 추가하거나 변경
		sb.append("hello");  // append 문자열 추가 메소드
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString());  // toString 메소드는 StringBuffer를 String 자료형으로 바꿔줌.
		
		// String 만으로 똑같은 결과 만드는 법
		// += 으로 자동으로 새로운 객체를 만듬.
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "jump to java";
		System.out.println(temp);
	}
}

// StringBuffer 는 객체를 한번만 생성하고 그 객체를 변경하는 것임.
// String 으로 += 로 하는 건 계속 새로운 객체를 만드는 것임
// String 자료형은 한번 값이 생성되면 그 값을 변경할 수 없다. 이처럼 변경할 수 없는 객체를 immutable하다고 한다.
// trim, toUpperCase 같은 메소드를 사용하는 것은 또다른 String을 생성해서 리턴하는 것일 뿐이다.
// StringBuffer 는 변경가능하다. mutable
// StringBuffer 를 사용하는게 무조건 좋나?
// 그건 아니다. StringBuffer 는 String 보다 무겁다.
// 메모리 사용량도 많고, 속도도 느리다.
// 따라서 문자열 추가나 변경의 작업이 많으면, StringBuffer
// 문자열 변경 거의 없으면 String 