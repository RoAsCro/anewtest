public class MatrixTwo{
	public int[][] grid;
	public int x, y;
	
	public static void main(String[] args) {
	MatrixTwo matrix = new MatrixTwo(3, 4);
	}

	public MatrixTwo(int x, int y) {
	grid = new int[x][y];
	this.x = x;
	this.y = y;
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			grid[i][j] = 1;
		}
	}
	}

	public void setElement(int x, int y, int z) {
		if (x >= this.x || y >= this.y) System.out.println("That reference is out of bounds");
		
		else {
			grid[x][y] = z;
		}

	}	

	public void setRow(int x, String row) {
		if (row.length() != y + y - 1) System.out.println("That input is the wrong length");
		else {
			int j = 0;
			for (int i = 0; i < row.length(); i++) {
				if (row.charAt(i) == ',') continue;
				grid[x][j] = Integer.parseInt(row.substring(i,i+1));
				j++;
			}
			
		}
	}

	public void setColumn(int y, String column) {
		if (column.length() != x + x - 1) System.out.println("That input is the wrong length");
		else {
			int j = 0;
			for (int i = 0; i < column.length(); i++) {
				if (column.charAt(i) == ',') continue;
				grid[j][y] = Integer.parseInt(column.substring(i,i+1));
				j++;
			}
		}
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < x; i++) {
			output += "[";

			for (int j = 0; j < y; j++) {
				if (j != 0) output += ",";
				output = output + grid[i][j];
			}

			output += ";";
		}
		output += "]";

		return output;
	}

	public void prettyPrint() {
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print("\t[" + grid[i][j] + "]");
			}
			System.out.println();
		}
	}

}