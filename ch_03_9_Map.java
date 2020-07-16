package practice01;

import java.util.HashMap;

public class ch_03_9_Map {
	public static void main(String[] args) {
		// Map ��  ���̽��� ��ųʸ� ���� key �� value�� 1��1 ���� ��Ű�� �ڷ���
		// �������� �ڷ� �ƴ�. ���� index �� ���� ã�� �� ����
		// key �� value�� ã�� ����.
		// Map�� �������̽��̴�.
		// Map �������̽��� �����ϴ� Map �ڷ������� HashMap, LinkedHashMap, TreeMap ���� �ִ�.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "���");
		map.put("baseball",  "�߱�");
		
		// key ���� �ش��ϴ� value�� ��� ���ؼ��� get �޼ҵ��
		System.out.println(map.get("people"));
		
		// containsKey �޼ҵ�
		// Map �� �ش� key �� �ִ� �� Ȯ��
		// ������ true, ������ false
		System.out.println(map.containsKey("baseball"));
		
		// remove �޼ҵ�
		// Map �� �׸� �����ϴ� �޼ҵ�
		// �����ϰ� ������ value ���� return ��.
		System.out.println(map.remove("people"));
		System.out.println(map.containsKey("people"));
		
		// size �޼ҵ�
		// map �� ��� �׸��� �ִ��� ������.
		System.out.println(map.size());
	}
}
