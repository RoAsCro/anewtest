public class MatrixInit {
	public static void main(String[] args) {
		MatrixTwo matrix = new MatrixTwo(5, 6);
		/*for (int i = 0; i < matrix.grid.length; i++) {
			for (int j = 0; j < matrix.grid[i].length; j++) {
				System.out.print("[" + matrix.grid[i][j] + "]");
			}
			System.out.println();
		}*/
		boolean go = true;
		while (go){
		System.out.println("Please select an operation: \n1 = Set element\n2 = Set row\n3 = Set column\n4 = Print all values\n5 = Print grid");
		int selection = Integer.parseInt(System.console().readLine());
		int arguments = 0, num1 = 0, num2 = 0, num3 = 0;
		String stringNum= "";
		if (selection == 1) arguments = 3;
		
		else if (selection > 1 && selection < 4) arguments = 2;
		for (int i = 0; i < arguments; i++) {
			System.out.println("Input a number");
			String num = System.console().readLine();
			switch(i) {
				case 0:
					num1 = Integer.parseInt(num);
					break;
				case 1:
					if (selection == 1) num2 = Integer.parseInt(num);
					else stringNum = num;
					break;
				case 2:
					num3 = Integer.parseInt(num);
					break;
			}
		}
		

		switch(selection) {
		
		case 1:
			matrix.setElement(num1, num2, num3);
			break;

		case 2:
			matrix.setRow(num1, stringNum);
			break;

		case 3:
			matrix.setColumn(num1, stringNum);
			break;

		case 4:
			System.out.println(matrix.toString());
			break;

		case 5:
			matrix.prettyPrint();
			break;					
		}
		}

		
	}

}