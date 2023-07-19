package answer;

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("È«±æµ¿", "ÀÚ¹Ù");      // 0
		dic.put("±è±æµ¿", "ÆÄÀÌ¼±");     // 1
		dic.put("±è±æµ¿", "C");        // 1
		
		System.out.println("È«±æµ¿ÀÇ °ªÀº " + dic.get("È«±æµ¿"));
		System.out.println("±è±æµ¿ÀÇ °ªÀº " + dic.get("±è±æµ¿"));
		dic.delete("È«±æµ¿");
		System.out.println("È«±æµ¿ÀÇ °ªÀº " + dic.get("È«±æµ¿"));

	}
}
