/**
 * ComplexNumber stores a real number and an imaginary
 * @author Chakra Kunda
 */
public class ComplexNumber {
	/**
	 * Instance variables
	 */
	private Number real, imaginary;
	/**
	 * Default constructor
	 */
	public ComplexNumber() {
		real = new Number();
		imaginary = new Number();
	}
	/**
	 * Parameterized constructor
	 * @param r real Number
	 * @param i imaginary Number
	 */
	public ComplexNumber(Number r, Number i) {
		real = new Number(r.getNumber());
		imaginary = new Number(i.getNumber());
	}
	/**
	 * Clone constructor
	 * @param cn ComplexNumber
	 */
	public ComplexNumber(ComplexNumber cn) {
		real = new Number(cn.real);
		imaginary = new Number(cn.imaginary);
	}
	/**
	 * Accessor method
	 * @return real Number
	 */
	public Number getReal() {
		return this.real;
	}
	/**
	 * Accessor method
	 * @return imaginary Number
	 */
	public Number getImaginary() {
		return this.imaginary;
	}
	/**
	 * Mutator method
	 * @param r real Number
	 */
	public void setReal(Number r) {
		real.setNumber(r.getNumber());
	}
	/**
	 * Mutator method
	 * @param i imaginary Number
	 */
	public void setImaginary(Number i) {
		imaginary.setNumber(i.getNumber());
	}
	/**
	 * Returns the complex number in string format (x + yi)
	 */
	public String toString() {
		String cs;
		
		// return + if imaginary part is positive
		if (imaginary.getNumber() >= 0)
			cs = "(" + String.valueOf(real) + " + " + String.valueOf(imaginary) + "i)";
		else
		// return - if imaginary part is negative
			cs = "(" + String.valueOf(real) + " - " + String.valueOf(imaginary.getNumber()*-1) + "i)";
		return cs;
	}
}
