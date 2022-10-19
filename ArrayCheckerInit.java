public class ArrayCheckerInit {
	static int[] list = {2, 2, 5, 4, 7, 8, 7, 4, 5, 4, 2};

	public static void main(String[] args) {
		ArrayChecker checker = new ArrayChecker();
		if (!checker.isSymmetrical(list)) {
			System.out.println(checker.reverse(list));
		} else System.out.println("Is symmetrical");
	}

}