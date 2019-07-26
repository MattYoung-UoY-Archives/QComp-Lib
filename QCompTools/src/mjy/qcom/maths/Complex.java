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
	
}
