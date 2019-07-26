package mjy.qcom;

import mjy.qcom.maths.CompVec;
import mjy.qcom.maths.Complex;
import mjy.qcom.maths.ComplexNum;

public class Chapter2Test {

	public static void main(String[] args) {
		
		ComplexNum a = new ComplexNum(5, 13);
		ComplexNum b = new ComplexNum(6, 2);
		ComplexNum c = new ComplexNum(0.53f, -6);
		ComplexNum d = new ComplexNum(12, 0);
		ComplexNum[] vec = {a, b, c, d};
		
		CompVec testVec = new CompVec(vec);
		
		ComplexNum a2 = new ComplexNum(7, -8);
		ComplexNum b2 = new ComplexNum(0, 4);
		ComplexNum c2 = new ComplexNum(2, 0);
		ComplexNum d2 = new ComplexNum(9.4f, 3);
		ComplexNum[] vec2 = {a2, b2, c2, d2};
		
		CompVec testVec2 = new CompVec(vec2);
		
		System.out.println(Complex.add(testVec, testVec2) + "\n");
		
		ComplexNum a3 = new ComplexNum(16, 2.3f);
		ComplexNum b3 = new ComplexNum(0, -7);
		ComplexNum c3 = new ComplexNum(6, 0);
		ComplexNum d3 = new ComplexNum(5, -4);
		ComplexNum[] vec3 = {a3, b3, c3, d3};
		
		CompVec testVec3 = new CompVec(vec3);
		
		System.out.println(Complex.scalarMultiply(testVec3, new ComplexNum(8, -2)) + "\n");
	
		System.out.println(Complex.transpose(testVec));
		
	}
	
}