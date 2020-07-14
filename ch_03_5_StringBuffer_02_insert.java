package practice01;

public class ch_03_5_StringBuffer_02_insert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("jump to java");
		String hello = "hello";
		int hello_length = hello.length();  // string의 length를 알려주는 메소드
		sb.insert(0, hello);  // String 추가할 수 있는 메소드. 위치 먼저 지정, 그리고 문자열
		sb.insert(hello_length,  " ");
		System.out.println(sb.toString());
	}
}
