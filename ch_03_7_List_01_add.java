package practice01;

import java.util.ArrayList;

public class ch_03_7_List_01_add {
	public static void main(String[] args) {
		// Array�� ���̰� ������ �ִ�. ó�� 10���� ��������ų�, ���̰� 10���� �������ٸ�, �� �̻� �����͸� ���� �� ����.
		// List�� �ڷ��� ������ �����̴�.
		// List �ڷ������� ArrayList, LinkedList ���� �ִ�.
		
		ArrayList<String> pitches = new ArrayList<String>();  // ArrayList�� �ڷ����� �������� ǥ��
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		System.out.println(pitches.get(1));  // List���� Ư�� �ε��� ���� �˰� ������ get �޼ҵ� ��� 
		
		System.out.println(pitches.size());  // List�� ���� �˰� ������ size �޼ҵ� ���.
		
		System.out.println(pitches.contains("142"));  // �ȿ� �ش� �׸� �ִ��� ����� ��. ������ boolean t, f�� ����
		
		System.out.println(pitches.remove("129"));  // �׸� �Ǵ� ��ü�� �����϶�� �ϸ�, true false �� �����ϰ�
		 
		System.out.println(pitches.remove(0));  // �ε����� �����ϸ�, �ε����� �ִ� �׸��� �����ϰ� ������.
		
		
	}
}
