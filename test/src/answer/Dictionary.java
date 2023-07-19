package answer;

class Dictionary extends PairMap {
	private int set;

	public Dictionary(int num) {
		KeyArray = new String[num];
		valueArray = new String[num];
		this.set = 0;
	}

	public String get(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				return valueArray[i];
			}
		}
		return null; // 원하는 key가 없다면 null 리턴
	}

	public void put(String key, String value) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				KeyArray[i] = key;
				valueArray[i] = value;
				return; // 중복된 key가 있다면 저장하고 함수 종료
			}
		}
		KeyArray[set] = key;
		valueArray[set] = value;
		set++;
	}

	public String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s = valueArray[i];
				KeyArray[i] = null;
				valueArray[i] = null;
				return s; // 삭제된 value 값 리턴
			}
		}
		return null; // 삭제된 것이 없다면 null 리턴
	}

	public int length() {
		return set;
	}
}