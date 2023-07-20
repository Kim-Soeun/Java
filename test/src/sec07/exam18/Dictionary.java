package sec07.exam18;

public class Dictionary extends PairMap {

	private int set;

	public Dictionary(int num) {
		KeyArray= new String [num];
		valueArray = new String [num];
		this.set = 0;
	}
	
	
	public String get(String key) {
		for(int i =0; i<KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s = valueArray[i];
				return s;
			}
		}	return null;
	}
	
	
	public void put(String key, String value) {
		for(int i =0; i<KeyArray.length; i++) {
			if(key.equals(KeyArray[i])) {
				KeyArray[i] = key;
				valueArray[i] = value;
				return;
			}
		}	KeyArray[set] =key;
			valueArray[set] = value;
			set++;
	}
	
	
	public String delete(String key) {
		for(int i=0; i<KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s= valueArray[i];
				KeyArray[i] = null;
				valueArray[i] = null;
				return s;
			}
		}	return null;
	}
	
	
	public int length() {
		return set;
	}
	
	
}
