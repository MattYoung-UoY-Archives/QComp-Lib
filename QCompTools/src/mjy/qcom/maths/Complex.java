package mjy.qcom.maths;

public class Complex {

	public static ComplexNum add(ComplexNum a, ComplexNum b) {
		return new ComplexNum(a.getR() + b.getR(), a.getI() + b.getI());
	}
	
	public static ComplexNum multiply(ComplexNum a, ComplexNum b) {
		float real = (a.getR() * b.getR()) - (a.getI() * b.getI());
		float imaginary = (a.getR() * b.getI()) + (a.getI() * b.getR());
		return new ComplexNum(real, imaginary);
	}
	
	public static ComplexNum sub(ComplexNum a, ComplexNum b) {
		return new ComplexNum(a.getR() - b.getR(), a.getI() - b.getI());
	}
	
	public static ComplexNum div(ComplexNum a, ComplexNum b) {
		float modSqr = (b.getR() * b.getR()) + (b.getI() * b.getI());
		float x = ((a.getR() * b.getR()) + (a.getI() * b.getI()))/modSqr;
		float y = ((b.getR() * a.getI()) - (a.getR() * b.getI()))/modSqr;
		return new ComplexNum(x, y);
	}
	
	protected static float mod(ComplexNum a) {
		return (float) Math.sqrt((a.getR() * a.getR()) + (a.getI() * a.getI()));
	}
	
	public static ComplexNum conj(ComplexNum a) {
		return new ComplexNum(a.getR(), -a.getI());
	}
	
	public static CompVec add(CompVec v, CompVec w) {
		if(v.getDimensionality() != w.getDimensionality()) throw new IllegalArgumentException("The two vectors specified must be of the same dimensionality!");
		ComplexNum[] res = new ComplexNum[v.getDimensionality()-1];
		for(int i = 0; i < v.getDimensionality()-1; i++) 
			res[i] = add(v.getI(i), w.getI(i));
		return new CompVec(res);
	}
	
	public static CompVec scalarMultiply(CompVec v, ComplexNum c) {
		ComplexNum[] res = new ComplexNum[v.getDimensionality()-1];
		for(int i = 0; i < v.getDimensionality() - 1; i++)
			res[i] = multiply(v.getI(i), c);
		return new CompVec(res);
	}
	
	public static CompVec inverse(CompVec v) {
		return scalarMultiply(v, new ComplexNum(-1, 0));
	}
	
	public static CompMat transpose(CompMat m) {
		int[] dims = m.getDimensions();
		ComplexNum[][] res = new ComplexNum[dims[1]][dims[0]];
		for(int j = 0; j < res.length; j++) {
			for(int k = 0; k < res[0].length; k++) {
				res[j][k] = m.getCjk(k, j);
			}
		}
		return new CompMat(res);
	}
	
//	public static CompMat add(CompMat m, CompMat n) {
		
//	}
	
}
