package practice01;


public class ch_03_5_StringBuffer_01_append {
	// StringBuffer �� ���ڿ��� �߰��ϰų� ������ �� �ַ� ����ϴ� �ڷ����̴�.
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  // StringBuffer �ƹ��͵� ����. ��ü�� ����. ���߿� �߰��ϰų� ����
		sb.append("hello");  // append ���ڿ� �߰� �޼ҵ�
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString());  // toString �޼ҵ�� StringBuffer�� String �ڷ������� �ٲ���.
		
		// String ������ �Ȱ��� ��� ����� ��
		// += ���� �ڵ����� ���ο� ��ü�� ����.
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "jump to java";
		System.out.println(temp);
	}
}

// StringBuffer �� ��ü�� �ѹ��� �����ϰ� �� ��ü�� �����ϴ� ����.
// String ���� += �� �ϴ� �� ��� ���ο� ��ü�� ����� ����
// String �ڷ����� �ѹ� ���� �����Ǹ� �� ���� ������ �� ����. ��ó�� ������ �� ���� ��ü�� immutable�ϴٰ� �Ѵ�.
// trim, toUpperCase ���� �޼ҵ带 ����ϴ� ���� �Ǵٸ� String�� �����ؼ� �����ϴ� ���� ���̴�.
// StringBuffer �� ���氡���ϴ�. mutable
// StringBuffer �� ����ϴ°� ������ ����?
// �װ� �ƴϴ�. StringBuffer �� String ���� ���̴�.
// �޸� ��뷮�� ����, �ӵ��� ������.
// ���� ���ڿ� �߰��� ������ �۾��� ������, StringBuffer
// ���ڿ� ���� ���� ������ String 