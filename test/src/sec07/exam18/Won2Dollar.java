package sec07.exam18;


public class Won2Dollar extends Converter {

	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	protected double convert(double src) {
		double result = src/ratio;
		return result;
	}
	
	protected String getSrcString() {
		return "��";
	}
	
	protected String getDestString() {
		return "�޷�";
	}
	
}
