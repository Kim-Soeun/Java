package sec07.exam18;


public class Km2Mile extends Converter {
	
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	protected double convert(double src) {
		double result = src/ratio;
		return result;
	}
	
	protected String getSrcString() {
		return "Km";
	}
	
	protected String getDestString() {
		return "Mile";
	}

	
}
