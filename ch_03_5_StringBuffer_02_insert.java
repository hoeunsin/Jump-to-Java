package practice01;

public class ch_03_5_StringBuffer_02_insert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("jump to java");
		String hello = "hello";
		int hello_length = hello.length();
		sb.insert(0, hello);
		sb.insert(hello_length,  " ");
		System.out.println(sb.toString());
	}
}
