/**
 * A Number class holds a single value of double type
 * @author Chakra Kunda
 * 
 */
public class Number {
	/**
	 * Instance variable
	 */
	private double value;
	/**
	 * Default constructor
	 */
	public Number() {
		value = 0;
	}
	/**
	 * Parameterized constructor
	 * @param v value
	 */
	public Number(double v) {
		value = v;
	}
	/**
	 * Clone constructor
	 * @param n Number
	 */
	public Number(Number n) {
		this.value = n.value;
	}
	/**
	 * Accessor method
	 * @return value
	 */
	public double getNumber() {
		return this.value;
	}
	/**
	 * Mutator method
	 * @param v value
	 */
	public void setNumber(double v) {
		this.value = v;
	}
	/**
	 *  Provide printable form of number
	 */
	public String toString() {
		return String.valueOf(value);
	}
}
