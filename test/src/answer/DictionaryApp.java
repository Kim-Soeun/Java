package answer;

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("ȫ�浿", "�ڹ�");      // 0
		dic.put("��浿", "���̼�");     // 1
		dic.put("��浿", "C");        // 1
		
		System.out.println("ȫ�浿�� ���� " + dic.get("ȫ�浿"));
		System.out.println("��浿�� ���� " + dic.get("��浿"));
		dic.delete("ȫ�浿");
		System.out.println("ȫ�浿�� ���� " + dic.get("ȫ�浿"));

	}
}
