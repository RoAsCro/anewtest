public class CalculatorInit {

	public static void main(String[] args) {
		CalculatorTwo calc = new CalculatorTwo();
		
		System.out.print("Please enter an operation: ");
		String input = System.console().readLine();
		System.out.print("Please enter a number: ");
		int numOne = Integer.parseInt(System.console().readLine());
		System.out.print("Please enter a number: ");
		int numTwo = Integer.parseInt(System.console().readLine());

		switch(input) {
		
		case "+":
			System.out.println(calc.add(numOne, numTwo));
			break;
		case "-":
			System.out.println(calc.subtract(numOne, numTwo));
			break;
		case "*":
			System.out.println(calc.multiply(numOne, numTwo));
			break;
		case "/":
			System.out.println(calc.divide(numOne, numTwo));
			break;
		case "%":
			System.out.println(calc.modulus(numOne, numTwo));
			break;


		}
	}

}