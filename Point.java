public class Point{
	private int x, y;	


	public static void main(String[] args){}

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int inX, int inY){
		x = inX;
		y = inY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int inX) {
		x = inX;
	}

	public void setY(int inY) {
		y = inY;
	}

	public void setXY(int inX, int inY) {
		setX(inX);
		setY(inY);
	}
}