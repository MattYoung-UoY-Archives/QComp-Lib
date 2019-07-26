package mjy.qcom.maths;

public class CompVec {

	private ComplexNum[] vector;
	
	public CompVec(ComplexNum[] vector) {
		this.vector = vector;
	}
	
	public ComplexNum getI(int index) {
		return vector[index];
	}
	
	public int getDimensionality() {
		return vector.length + 1;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(int i = 0; i < vector.length; i++) {
			result += "(" + vector[i] + ")";
			if(i < vector.length - 1) result += ",\n";
		}
		result += "]";
		return result;
	}
	
}
