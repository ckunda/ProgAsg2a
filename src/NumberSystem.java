/**
 * A simple number system that provides
 *  add, subtract, multiply, divide, modulus, and inverse
 * @author Chakra Kunda
 *
 */
public class NumberSystem {
	/**
	 * Instance variables
	 */
	private Number n1;
	private Number n2;
	private Number result;
	/**
	 * Default constructor
	 */
	public NumberSystem() {
		n1 = new Number();
		n2 = new Number();
		result = new Number();
	}
	/**
	 * Parameterized constructor
	 * @param num1 Number
	 */
	public NumberSystem(Number num1) {
		n1 = new Number(num1.getNumber());
		n2 = new Number();
		result = new Number();
	}
	/**
	 * Parameterized constructor
	 * @param num1 Numbner
	 * @param num2 Number
	 */
	public NumberSystem(Number num1, Number num2) {
		n1 = new Number(num1.getNumber());
		n2 = new Number(num2.getNumber());
		result = new Number();
	}
	/**
	 * Clone constructor
	 * @param ns NumberSystem
	 */
	public NumberSystem(NumberSystem ns) {
		n1 = new Number(ns.n1);
		n2 = new Number(ns.n2);
		result = new Number(ns.result);
	}
	/**
	 * Accessors
	 * @return N1 Number
	 */
	public Number getN1() {
		return this.n1;
	}
	/**
	 * Accessors
	 * @return N2 Number
	 */
	public Number getN2() {
		return this.n2;
	}
	/**
	 * Accessors
	 * @return result Number
	 */
	public Number getResult() {
		return this.result;
	}
	/**
	 * Mutators
	 * @param num1 Number
	 */
	public void setN1(Number num1) {
		n1.setNumber(num1.getNumber());
	}
	/**
	 * Mutator 
	 * @param num2 Number
	 */
	public void setN2(Number num2) {
		n2.setNumber(num2.getNumber());
	}
	/**
	 * Add method
	 * adds n1 and n2 and stores the result in the result variable
	 * 
	 */
	public void add() {
		result.setNumber(n1.getNumber() + n2.getNumber());
	}
	/**
	 * Subtract method
	 * subtracts n2 from n1 and stores the result in the result variable
	 */
	public void subtract() {
		result.setNumber(n1.getNumber() - n2.getNumber());
	}
	/**
	 * Multiply method
	 * multiplies n1 and n2 and stores the result in the result variable
	 */
	public void multiply() {
		result.setNumber(n1.getNumber() * n2.getNumber());
	}
	/**
	 * Divide method
	 * divides n2 into n1 and stores the result in the result variable
	 */
	public void divide() {
		if (n2.getNumber() != 0)
			result.setNumber(n1.getNumber() / n2.getNumber());
	}
	/**
	 * Modules method
	 * calculates the remainder after dividing n2 into n1 and stores the result in the result variable
	 */
	public void mod() {
		result.setNumber(n1.getNumber() % n2.getNumber());
	}
	/**
	 * Inverse method
	 * multiplies n1 by -1
	 */
	public void invertN1() {
		n1.setNumber(n1.getNumber() * -1);
	}
	/**
	 * Inverse method
	 * multiplies n2 by -1
	 */
	public void invertN2() {
		n2.setNumber(n2.getNumber() * -1);
	}
}
