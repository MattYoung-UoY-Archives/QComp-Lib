package mjy.qcom;

import mjy.qcom.maths.Complex;
import mjy.qcom.maths.ComplexNum;

public class Main {

	public static void main(String[] args) {
		
		ComplexNum a = new ComplexNum(3.64f, 1.75f);
		ComplexNum b = new ComplexNum(2.39f, 6.41f);
		
		System.out.println("a: " + a + "\nb: " + b);
		
		ComplexNum sum = Complex.add(a, b);
		ComplexNum mult = Complex.multiply(a, b);
		
		System.out.println("Sum: " + sum + "\nMult: " + mult);
		
		ComplexNum x = new ComplexNum(-1, 1);
		
		//x^2 + 2x + 2
		ComplexNum result = Complex.add(Complex.multiply(x, x), Complex.add(Complex.add(x, x), new ComplexNum(2, 0)));
		
		System.out.println("\nx: " + x + "\nx^2 + 2x + 2\nResult: " + result);
		
		ComplexNum sub = Complex.sub(a, b);
		ComplexNum div = Complex.div(a, b);
		
		System.out.println("\nSub: " + sub + "\nDiv: " + div);
		
		float modA = a.getMod();
		ComplexNum conjA = Complex.compConj(a);
		
		System.out.println("\nMod a: " + modA + "\nConjugate a: " + conjA);
		
		ComplexNum c = new ComplexNum(1.5f, 2);
		ComplexNum scalar = new ComplexNum(2, 0);
		
		System.out.println("\n" + Complex.multiply(c, scalar));
		
	}
	
}
