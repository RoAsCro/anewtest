public class ArrayChecker{

	public boolean isSymmetrical(int[] list) {
		for (int i = 0; i <= (list.length / 2); i++) {
			if (list[i] != list[list.length-i-1]) return false;
		}
		return true;
	}

	public int[] reverse(int[] list) {
		int[] listTwo = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			listTwo[i] = list[list.length - 1 - i];	
		}
		return listTwo;
	}

}