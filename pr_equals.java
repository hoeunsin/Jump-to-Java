package practice01;

public class pr_equals {
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		System.out.println(a.equals(b));  // true �� ��� ��
		System.out.println(a.equals(c));  // true �� ��µ�
		System.out.println(a==b);   // true �� ���
		System.out.println(a==c);   // false �� ��µ�
	}
}


// == �� �� �ڷ����� ������ '��ü'�ΰ��� �Ǻ��� �� ���� ��������.
// �� '���ڿ�'�� �������� ���� ������, a.equals(b) �� ���ÿ�.