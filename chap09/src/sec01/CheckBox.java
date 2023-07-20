package sec01;

public class CheckBox {		// 423p 5¹ø ¹®Á¦

	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener {
		void onSelect();
	}
	
}
