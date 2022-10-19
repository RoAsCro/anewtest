public class Test{
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("You need to input two values.");
		} else {	
			Point point = new Point(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			System.out.println("(" + point.getX() + ", " + point.getY() + ")");
			int newX = Integer.parseInt(System.console().readLine()), newY = Integer.parseInt(System.console().readLine());
			point.setXY(newX, newY);
			System.out.println("(" + point.getX() + ", " + point.getY() + ")");
		}
	}

}