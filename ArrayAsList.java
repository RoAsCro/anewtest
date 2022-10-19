public class ArrayAsList {
	ArrayNumber firstNumber = null;


	public void addNumber(ArrayNumber number) {
		ArrayNumber currentNumber = firstNumber;
		boolean go = true;
		if (firstNumber == null) firstNumber = number;
		else if (firstNumber.getNumber() > number.getNumber()) {
			number.setNextNumber(firstNumber);
			firstNumber = number;
		}
		else while(go) {
			if (currentNumber.getNextNumber() == null || currentNumber.getNextNumber().getNumber() > number.getNumber()) {
				number.setNextNumber(currentNumber.getNextNumber());
				currentNumber.setNextNumber(number);
				break;
			} else  currentNumber = currentNumber.getNextNumber();
		}
	}

	public void printList() {
		if (firstNumber == null) {
			return;			
		}
		ArrayNumber currentNumber = firstNumber;
		boolean go = true;
		while(go) {
			System.out.print(currentNumber.getNumber());
			if (currentNumber.getNextNumber() == null) {
				System.out.println();
				return;
			
			}
			System.out.print(", ");
			currentNumber = currentNumber.getNextNumber();
		}
		
	}


}