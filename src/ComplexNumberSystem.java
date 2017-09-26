/**
 * Complex Number System Calculator.
 * This class adds, subtracts, multiplies, and divides complex numbers
 * @author Chakra Kunda
 */
public class ComplexNumberSystem {
	/**
	 * Instance variables
	 * ComplexNumber cn1, cn2, and result
	 */
	ComplexNumber cn1, cn2, result;
	
	// The below strings will be used in division method
	String resultRealString, resultImaginaryString, resultCNString;
	/**
	 * Default constructor
	 */
	public ComplexNumberSystem() {
		cn1 = new ComplexNumber();
		cn2 = new ComplexNumber();
		result = new ComplexNumber();
		resultRealString = "";
		resultImaginaryString = "";
		resultCNString = "";
	}
	/**
	 * Parameterized constructor
	 * @param n1 ComplexNumber
	 */
	public ComplexNumberSystem(ComplexNumber n1) {
		cn1 = new ComplexNumber(n1);
		cn2 = new ComplexNumber();
		result = new ComplexNumber();
		resultRealString = "";
		resultImaginaryString = "";
		resultCNString = "";
	}
	/**
	 * Parameterized constructor
	 * @param n1 ComplexNumber
	 * @param n2 ComplexNumber
	 */
	public ComplexNumberSystem(ComplexNumber n1, ComplexNumber n2) {
		cn1 = new ComplexNumber(n1);
		cn2 = new ComplexNumber(n2);
		result = new ComplexNumber();
		resultRealString = "";
		resultImaginaryString = "";
		resultCNString = "";
	}
	/**
	 * Copy constructor
	 * @param cns ComplexNumberSystem
	 */
	public ComplexNumberSystem(ComplexNumberSystem cns) {
		cn1 = new ComplexNumber(cns.cn1);
		cn2 = new ComplexNumber(cns.cn2);
		result = new ComplexNumber(cns.result);
		resultRealString = "";
		resultImaginaryString = "";
		resultCNString = "";
	}
	/**
	 *  Accessors
	 * @return ComplexNumber N1
	 */
	public ComplexNumber getN1() {
		return cn1;
	}
	/**
	 *  Accessors
	 * @return ComplexNumber N2
	 */
	public ComplexNumber getN2() {
		return cn2;
	}
	/**
	 *  Accessors
	 * @return ComplexNumber result
	 */
	public ComplexNumber getResult() {
		return result;
	}

	/** 
	 * Adds two complex numbers
	 * (a + bi) + (c + di) = (a + c) + (b + d)i
	 * Example: (3 - 5i) + (-4 + 7i) = (-1 + 2i)
	 */
	public void add() {
		
		NumberSystem real = new NumberSystem(cn1.getReal(), cn2.getReal());
		real.add();
		result.setReal(real.getResult());

		NumberSystem imaginary = new NumberSystem(cn1.getImaginary(), cn2.getImaginary());
		imaginary.add();
		result.setImaginary(imaginary.getResult());

	}
	/**
	 * Subtracts two complex numbers
	 * (a + bi) + (c + di) = (a - c) + (b - d)i
	 * Example: (-5 + 3i) - (4 + 7i) = 
	 */
	public void subtract() {
		
		NumberSystem real = new NumberSystem(cn1.getReal(), cn2.getReal());
		real.subtract();
		result.setReal(real.getResult());

		NumberSystem imaginary = new NumberSystem(cn1.getImaginary(), cn2.getImaginary());
		imaginary.subtract();
		result.setImaginary(imaginary.getResult());

	}
	
	/**
	 * Multiplies two complex numbers
	 *  (a + bi) (c + di) = (ac − bd) + (ad + bc)i
	 *  Example: (3 + 2i)(1 + 7i) = (3×1 − 2×7) + (3×7 + 2×1)i = −11 + 23i
	 */
	public void multiply() {
		
		NumberSystem real1 = new NumberSystem(cn1.getReal(), cn2.getReal());
		real1.multiply();
		NumberSystem real2 = new NumberSystem(cn1.getImaginary(), cn2.getImaginary());
		real2.multiply();
		NumberSystem real = new NumberSystem(real1.getResult(), real2.getResult());
		real.subtract();
		result.setReal(real.getResult());

		NumberSystem imaginary1 = new NumberSystem(cn1.getReal(), cn2.getImaginary());
		imaginary1.multiply();
		NumberSystem imaginary2 = new NumberSystem(cn1.getImaginary(), cn2.getReal());
		imaginary2.multiply();
		NumberSystem imaginary = new NumberSystem(imaginary1.getResult(), imaginary2.getResult());
		imaginary.add();
		result.setImaginary(imaginary.getResult());

	}
	/**
	 * Divides two complex numbers.
	 * (a + bi) / (x + yi) = ((a + bi) * (x - yi)) / (xx + yy)
	 * Example (2 + 5i) / (3 + i) = (11/10 + 13/10i) = (1.1 + 1.3i)
	 */
	public void divide () {
		
		// First clone the 2nd complex number to get conjugate
		ComplexNumber cn2clone = new ComplexNumber(cn2);
		
		// Inverse the sign of the imaginary number of the clone
		NumberSystem tempns1 = new NumberSystem(cn2clone.getImaginary());
		tempns1.invertN1();
		cn2clone.setImaginary(tempns1.getN1());
		
		// Create two new complex number systems (top and bottom) and multiply
		ComplexNumberSystem cnsTop = new ComplexNumberSystem(cn1,cn2clone);
		cnsTop.multiply();
//		System.out.println(" cnsTop," +
//				" cn1 (a + bi) = " + cnsTop.cn1.toString() + 
//				", cn2 (c + di) = " + cnsTop.cn2.toString() +
//				", result = " + cnsTop.result.toString());

		ComplexNumberSystem cnsBottom = new ComplexNumberSystem(cn2,cn2clone);
		cnsBottom.multiply();
		cnsBottom.result.setImaginary(cnsBottom.result.getReal());
//		System.out.println(" cnsBottom," +
//				" cn1 (a + bi) = " + cnsBottom.cn1.toString() + 
//				", cn2 (c + di) = " + cnsBottom.cn2.toString() +
//				", result = " + cnsBottom.result.toString());
		
		// Set result
		tempns1.setN1(cnsTop.result.getReal());
		tempns1.setN2(cnsBottom.result.getReal());
		tempns1.divide();
		result.setReal(tempns1.getResult());

		tempns1.setN1(cnsTop.result.getImaginary());
		tempns1.setN2(cnsBottom.result.getImaginary());
		tempns1.divide();
		result.setImaginary(tempns1.getResult());

		// Store the result in string format
		resultRealString = cnsTop.result.getReal().toString() + "/" + cnsBottom.result.getReal().toString();
//		System.out.println(resultReal);
		resultImaginaryString = cnsTop.result.getImaginary().toString() + "/" + cnsBottom.result.getImaginary().toString();
//		System.out.println(resultImaginary);
		resultCNString = '(' + resultRealString + " + " + resultImaginaryString + "i)";

	}
}
