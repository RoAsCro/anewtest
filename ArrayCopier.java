public class ArrayCopier {
	static int[] listOne = {1, 2, 3, 4, 5}, listTwo = new int[2];

	public static void main(String[] args) {
		ArrayCopier copier = new ArrayCopier();
		copier.copy();
	}

	public void copy() {

		for (int i = 0; i < listTwo.length; i++) {
				if (i < listOne.length) listTwo[i] = listOne[i];
				else listTwo[i] = 0;
		}

		for (int i = 0; i < listTwo.length; i++) System.out.print(listTwo[i]);

		/*if (listOne.length == listTwo.length){
			for (int i = 0; i < listOne.length; i++) {
				listTwo[i] = listOne[i];
			}
		} else if (listOne.length > listTwo.length) {
			for (int i = 0 i < listTwo.length; i++) {
				listTwo[i] = listOne[i];
			}
		} else if (listOne.length < listTwo.length) {
			for (int i = 0 i < listTwo.length; i++) {
				if (i < listOne.length) listTwo[i] = listOne[i];
				else listTwo[i] = 0;
		}*/
	}
}