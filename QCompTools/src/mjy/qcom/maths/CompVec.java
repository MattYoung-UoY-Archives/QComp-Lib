package mjy.qcom.maths;

public class CompVec extends CompMat{
	
	public CompVec(ComplexNum[] vector) {
		super(vector);
	}
	
	//Need to add Constructor to take a matrix that can be converted to a vector
	
	public ComplexNum getI(int index) {
		return super.getCjk(0, index);
	}
	
	public int getDimensionality() {
		int[] temp = super.getDimensions();
		return temp[1] + 1;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(int i = 0; i < this.getDimensionality() - 1; i++) {
			result += "(" + getI(i) + ")";
			if(i < this.getDimensionality() - 2) result += ", ";
		}
		result += "]";
		return result;
	}
	
}