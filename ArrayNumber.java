public class ArrayNumber {

	private final int num;
	private ArrayNumber nextNumber;

	public ArrayNumber(int num) {
		this.num = num;
	}

	public void setNextNumber(ArrayNumber number) {
		nextNumber = number;
	}

	public ArrayNumber getNextNumber() {
		return nextNumber;
	}

	public int getNumber() {
		return num;
	}
}