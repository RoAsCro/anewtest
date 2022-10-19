public class ArrayUtilities {

	static public void main(String[] args) {
		int[] array = {6, 4, 3, 4, 2, 6, 9, 8};
		ArrayAsList list = asList(array);
		list.printList();

	}

	static public ArrayAsList asList(int[] array) {
		ArrayAsList list = new ArrayAsList();

		for (int i = 0; i < array.length; i++) {
			ArrayNumber number = new ArrayNumber(array[i]);
			list.addNumber(number);
		}
		return list;
	}

}