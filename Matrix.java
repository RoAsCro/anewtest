public class Matrix{
	int[][] grid;
	int x, y;
	
	public static void main(String[] args) {
	Matrix matrix = new Matrix(3, 4);
	}

	Matrix(int x, int y) {
	grid = new int[x][y];
	this.x = x;
	this.y = y;
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			grid[i][j] = 1;
		}
	}
	System.out.println(grid[0][0]);
	}

	public void setElement(int x, int y, int z) {
	if (x >= this.x || y >= this.y) System.out.print("That reference is out of bounds");
	else {
		grid[x][y] = z;
	}

	}	

}