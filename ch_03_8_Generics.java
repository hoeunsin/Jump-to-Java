package practice01;

import java.util.ArrayList;

public class ch_03_8_Generics {
	public static void main(String[] args) {
		// Generic�� ArrayList �ڿ��� ���� ��.
		// �׳� ��ü�� �����, Object �ڷ������� �Ǵµ�, generic �� ����, ó������ �ڷ��� ����.
		// generic ���� ��ü�� �����,
		// ���� ������ ��쿡�� String���� (casting)���� �ڷ����� ��ȯ�ؼ� �����;� ��.
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
