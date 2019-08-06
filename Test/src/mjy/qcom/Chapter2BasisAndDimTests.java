package mjy.qcom;

import java.util.Arrays;

import mjy.qcom.maths.CompMat;
import mjy.qcom.maths.Complex;
import mjy.qcom.maths.ComplexNum;

public class Chapter2BasisAndDimTests {
	
	public static void main(String[] args) {
		ComplexNum a = new ComplexNum(5, 13);
		ComplexNum b = new ComplexNum(6, 2);
		ComplexNum c = new ComplexNum(0.53f, -6);
		ComplexNum d = new ComplexNum(12, 0);
		ComplexNum[][] vec = {{a}, {b}, {c}, {d}};
		CompMat testVec = new CompMat(vec);
		
		ComplexNum a2 = new ComplexNum(7, -8);
		ComplexNum b2 = new ComplexNum(0, 4);
		ComplexNum c2 = new ComplexNum(2, 0);
		ComplexNum d2 = new ComplexNum(9.4f, 3);
		ComplexNum[][] vec2 = {{a2}, {b2}, {c2}, {d2}};
		CompMat testVec2 = new CompMat(vec2);
		
		ComplexNum[][] matAVec = {{new ComplexNum(3, 2), new ComplexNum(0, 0), new ComplexNum(5, -6)}, 
				{new ComplexNum(1, 0), new ComplexNum(4, 2), new ComplexNum(0, 1)}, 
				{new ComplexNum(4, -1), new ComplexNum(0, 0), new ComplexNum(4, 0)}};
		CompMat matA = new CompMat(matAVec);

		ComplexNum[][] matBVec = {{new ComplexNum(5, 0), new ComplexNum(2, -1), new ComplexNum(6, -4)},
				{new ComplexNum(0, 0), new ComplexNum(4, 5), new ComplexNum(2, 0)},
				{new ComplexNum(7, -4), new ComplexNum(2, 7), new ComplexNum(0, 0)}};
		CompMat matB = new CompMat(matBVec);
		
		ComplexNum cubeRtTest = new ComplexNum(1, 1);
		
		System.out.println(Arrays.toString(Complex.nthRoot(cubeRtTest, 3)) + "\n\n");
		
		ComplexNum[][] norm1vec = {{new ComplexNum(4, 3)}, {new ComplexNum(6, -4)}, {new ComplexNum(12, -7)}, {new ComplexNum(0, 13)}};
		CompMat norm1 = new CompMat(norm1vec);
		
		System.out.println(Complex.normVec(norm1));
	}
	
}
