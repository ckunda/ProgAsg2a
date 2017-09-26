
public class Main {

	public static void main(String[] args) {
		
	// Test Number Class
		System.out.println("Test Number Class");
		Number num1 = new Number(1);
		System.out.println("1. num1 = " + num1.toString());
		Number num2 = new Number(num1);
		System.out.println("2. num2 = " + num2.toString());
		num1.setNumber(2);
		System.out.println("3. num1 = " + num1.toString());
		num2.setNumber(4);
		System.out.println("4. num2 = " + num2.toString());
		System.out.println("");
		
	// Test NumberSystem Class
		System.out.println("Test NumberSystem Class");
		NumberSystem ns = new NumberSystem();
		System.out.println("1. ns," +
				" n1 = " + ns.getN1().toString() + 
				", n2 = " + ns.getN2().toString() +
				", result = " + ns.getResult().toString());
		NumberSystem ns1 = new NumberSystem(num1);
		System.out.println("2. ns1," +
				" n1 = " + ns1.getN1().toString() + 
				", n2 = " + ns1.getN2().toString() +
				", result = " + ns1.getResult().toString());
		NumberSystem ns2 = new NumberSystem(new Number(), num2);
		System.out.println("3. ns2," +
				" n1 = " + ns2.getN1().toString() + 
				", n2 = " + ns2.getN2().toString() +
				", result = " + ns2.getResult().toString());
		NumberSystem nsDup = new NumberSystem(ns1);
		System.out.println("4. nsDup(of ns1)," +
				" n1 = " + nsDup.getN1().toString() + 
				", n2 = " + nsDup.getN2().toString() +
				", result = " + nsDup.getResult().toString());
		NumberSystem nsTest1 = new NumberSystem(new Number(10), new Number(10));
		nsTest1.add();
		System.out.println("5. nsTest1 (10 + 10 = 20)," +
				" n1 = " + nsTest1.getN1().toString() + 
				", n2 = " + nsTest1.getN2().toString() +
				", result = " + nsTest1.getResult().toString());
		nsTest1.subtract();
		System.out.println("6. nsTest1 (10 - 10 = 0)," +
				" n1 = " + nsTest1.getN1().toString() + 
				", n2 = " + nsTest1.getN2().toString() +
				", result = " + nsTest1.getResult().toString());
		nsTest1.setN1(new Number(35));
		nsTest1.invertN1();
		System.out.println("7. nsTest1 (inverse n1 35)," +
				" n1 = " + nsTest1.getN1().toString() + 
				", n2 = " + nsTest1.getN2().toString() +
				", result = " + nsTest1.getResult().toString());
		nsTest1.setN1(new Number(12));
		nsTest1.setN2(new Number(2));
		nsTest1.mod();
		System.out.println("8. nsTest1 (12 mod 2 = 0)," +
				" n1 = " + nsTest1.getN1().toString() + 
				", n2 = " + nsTest1.getN2().toString() +
				", result = " + nsTest1.getResult().toString());
		nsTest1.setN1(new Number(21));
		nsTest1.setN2(new Number(4));
		nsTest1.mod();
		System.out.println("9. nsTest1 (21 mod 4 = 1)," +
				" n1 = " + nsTest1.getN1().toString() + 
				", n2 = " + nsTest1.getN2().toString() +
				", result = " + nsTest1.getResult().toString());
		nsTest1.multiply();
		System.out.println("10. nsTest1 (21 * 4 = 84)," +
				" n1 = " + nsTest1.getN1().toString() + 
				", n2 = " + nsTest1.getN2().toString() +
				", result = " + nsTest1.getResult().toString());
		nsTest1.divide();
		System.out.println("11. nsTest1 (21 / 4 = 5.25)," +
				" n1 = " + nsTest1.getN1().toString() + 
				", n2 = " + nsTest1.getN2().toString() +
				", result = " + nsTest1.getResult().toString());
		System.out.println("");
		
		// Test ComplexNumber Class
		System.out.println("Test ComplexNumber Class");
		ComplexNumber cn = new ComplexNumber();
		System.out.println("1. cs," +
				" real = " + cn.getReal().toString() + 
				", imaginary = " + cn.getImaginary().toString() +
				", Complex Number (a + bi) = " + cn.toString());
		ComplexNumber cn1 = new ComplexNumber(new Number(3), new Number(5));
		System.out.println("2. cs," +
				" real = " + cn1.getReal().toString() + 
				", imaginary = " + cn1.getImaginary().toString() +
				", Complex Number (a + bi) = " + cn1.toString());
		ComplexNumber cn2 = new ComplexNumber(new Number(4), new Number(-3));
		System.out.println("3. cs," +
				" real = " + cn2.getReal().toString() + 
				", imaginary = " + cn2.getImaginary().toString() +
				", Complex Number (a + bi) = " + cn2.toString());
		System.out.println("");

		// Test ComplexNumberSystem Class 
		System.out.println("Test ComplexNumberSystem Class");
		ComplexNumberSystem cns = new ComplexNumberSystem();
		
		System.out.println("1. Default constructor");
		printCNS(cns);
	
		System.out.println("\n2. New variable cns1 with ADD method");
		ComplexNumberSystem cns1 = new ComplexNumberSystem(cn1,cn2);
		cns1.add();
		printCNS(cns1);
		
		System.out.println("\n3. New variable cns2 (CLONE of cns1)");
		ComplexNumberSystem cns2 = new ComplexNumberSystem(cns1);
		printCNS(cns2);
		
		System.out.println("\n4.Changed variable cns2 values and ADD method");
		cns2.cn1.setReal(new Number(3));
		cns2.cn1.setImaginary(new Number(2));
		cns2.cn2.setReal(new Number(1));
		cns2.cn2.setImaginary(new Number(7));
		cns2.add();
		printCNS(cns2);
		
		System.out.println("\n5. Variable cns2 values and SUBTRACT method");
		cns2.subtract();
		printCNS(cns2);
		
		System.out.println("\n6.Changed variable cns2 values and ADD method");
		cns2.cn1.setReal(new Number(-5));
		cns2.cn1.setImaginary(new Number(3));
		cns2.cn2.setReal(new Number(4));
		cns2.cn2.setImaginary(new Number(7));
		cns2.add();
		printCNS(cns2);
		
		System.out.println("\n7. Variable cns2 same values and SUBTRACT method");
		cns2.subtract();
		printCNS(cns2);
		
		System.out.println("\n8. Changed variable cns1 values and MULTIPLY method");
		cns1.cn1.setReal(new Number(3));
		cns1.cn1.setImaginary(new Number(2));
		cns1.cn2.setReal(new Number(1));
		cns1.cn2.setImaginary(new Number(7));
		cns1.multiply();
		printCNS(cns1);
		
		System.out.println("\n9. Changed variable cns1 values and ADD method");
		cns1.cn1.setReal(new Number(3));
		cns1.cn1.setImaginary(new Number(-5));
		cns1.cn2.setReal(new Number(-4));
		cns1.cn2.setImaginary(new Number(7));
		cns1.add();
		printCNS(cns1);
		
		System.out.println("\n10. Changed variable cns1 values and MULTIPLY method");
		cns1.cn1.setReal(new Number(2));
		cns1.cn1.setImaginary(new Number(5));
		cns1.cn2.setReal(new Number(3));
		cns1.cn2.setImaginary(new Number(-2));
		cns1.multiply();
		printCNS(cns1);
		
		System.out.println("\n11. Changed variable cns1 values and MULTIPLY method");
		cns1.cn1.setReal(new Number(4));
		cns1.cn1.setImaginary(new Number(-5));
		cns1.cn2.setReal(new Number(-2));
		cns1.cn2.setImaginary(new Number(7));
		cns1.multiply();
		printCNS(cns1);
		
		System.out.println("\n12. Changed variable cns1 values and MULTIPLY method");
		cns1.cn1.setReal(new Number(3));
		cns1.cn1.setImaginary(new Number(4));
		cns1.cn2.setReal(new Number(3));
		cns1.cn2.setImaginary(new Number(-4));
		cns1.multiply();
		printCNS(cns1);
		
		System.out.println("\n13. Changed variable cns1 values and DIVIDE method");
		cns1.cn1.setReal(new Number(3));
		cns1.cn1.setImaginary(new Number(-1));
		cns1.cn2.setReal(new Number(2));
		cns1.cn2.setImaginary(new Number(7));
		cns1.divide();
		printCNSd(cns1);
		
		System.out.println("\n14. Changed variable cns1 values and DIVIDE method");
		cns1.cn1.setReal(new Number(3));
		cns1.cn1.setImaginary(new Number(0));
		cns1.cn2.setReal(new Number(9));
		cns1.cn2.setImaginary(new Number(-1));
		cns1.divide();
		printCNSd(cns1);
		
		System.out.println("\n15. Changed variable cns1 values and DIVIDE method");
		cns1.cn1.setReal(new Number(0));
		cns1.cn1.setImaginary(new Number(8));
		cns1.cn2.setReal(new Number(1));
		cns1.cn2.setImaginary(new Number(2));
		cns1.divide();
		printCNSd(cns1);
		
		System.out.println("\n16. Changed variable cns1 values and DIVIDE method");
		cns1.cn1.setReal(new Number(6));
		cns1.cn1.setImaginary(new Number(-9));
		cns1.cn2.setReal(new Number(0));
		cns1.cn2.setImaginary(new Number(2));
		cns1.divide();
		printCNSd(cns1);
		
		System.out.println("\n17. Changed variable cns1 values and DIVIDE method");
		cns1.cn1.setReal(new Number(2));
		cns1.cn1.setImaginary(new Number(3));
		cns1.cn2.setReal(new Number(4));
		cns1.cn2.setImaginary(new Number(-5));
		cns1.divide();
		printCNSd(cns1);

		System.out.println("\n18. Changed variable cns1 values and DIVIDE method");
		cns1.cn1.setReal(new Number(2));
		cns1.cn1.setImaginary(new Number(5));
		cns1.cn2.setReal(new Number(3));
		cns1.cn2.setImaginary(new Number(1));
		cns1.divide();
		printCNSd(cns1);
	}
	
	// Prints contents of Complex Number Object
	public static void printCNS(ComplexNumberSystem cns) {
		
		System.out.println(" cns," +
				" cn1 (a + bi) = " + cns.cn1.toString() + 
				", cn2 (c + di) = " + cns.cn2.toString() +
				", \nresult = " + cns.result.toString());
	}
	// Prints contents of Complex Number Object (division results)
	public static void printCNSd(ComplexNumberSystem cns) {
		
		System.out.println(" cns1," +
				" cn1 (a + bi) = " + cns.cn1.toString() + 
				", cn2 (c + di) = " + cns.cn2.toString() +
				", \nresult = " + cns.result.toString() +
				", \nresult = " + cns.resultCNString);
	}
}
