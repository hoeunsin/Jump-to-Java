package practice01;

public class ch_03_6_Array {
	public static void main(String[] args) {
		// int[] odds = {1,3,5,7,9}; // ���� ���� ��. �ڷ����� ���� �Ѱ��� ������
		
		String[] weeks = {"��","ȭ","��","��","��","��","��"};  // ���ڿ��� �迭 ����� ��
		System.out.println(weeks[3]);
		
		String[] weeks2 = new String[7];  // �ʱⰪ ���� �迭 ���� ���� ���� ���̸� �����־�߸� �Ѵ�.
		weeks2[0] = "Mon";
		weeks2[1] = "Tue";
		weeks2[2] = "Wed";
		weeks2[3] = "Thu";
		weeks2[4] = "Fri";
		weeks2[5] = "Sat";
		weeks2[6] = "Sun";
		
		System.out.println(weeks2[3]);
		System.out.println(weeks.length);
		for (int i=0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}
}
