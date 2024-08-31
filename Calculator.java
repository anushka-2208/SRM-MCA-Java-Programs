//Practical number 6

package gungun;

public class Calculator {
	
	public double sum(double num1, double num2) { // addition method

		return num1 + num2;

	}

	public double subtract(double num1, double num2) { // subtraction method

		return num1 - num2;

	}

	public double multiply(double num1, double num2) { // multiplication method

		return num1 * num2;

	}

	public double divide(double num1, double num2) { // division method

		if( num2 == 0) { // exception handling

			throw new ArithmeticException("Can't div by 0");

		}

		return num1 / num2;

	}

	public double modulus(double num1, double num2) { // modulus method

		if (num2 == 0) { // exception handling

			throw new ArithmeticException("Can't do this");

		}

		return num1%num2;

	}



	public static void main(String[] args) {
		double result;


		Calculator calc = new Calculator(); // creating object of Calculator class

		result = calc.sum(20,0);
		System.out.println("The sum of numbers is: " + result);
		
		result = calc.subtract(20,0);
		System.out.println("The difference betweeen the numbers is: "+ result);
		
		result = calc.multiply(20,0);
		System.out.println("The multiplication of two numbers is: "+ result);
		
		result = calc.divide(20,4);
		System.out.println("The division result is: "+ result);
		
		result = calc.modulus(20,23);
		System.out.println("The Modulus is: "+ result);


	}

}