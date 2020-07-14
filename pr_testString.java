package practice01;

public class pr_testString {
	public static void main(String[] args) {
		String a = "Hello Java";
		System.out.println(a.indexOf("J"));
		System.out.println(a.replaceAll("Java", "World"));
		System.out.println(a.substring(0,4));
		System.out.println(a.toUpperCase());
	}
}
