class hypot {
	public static void main(String[] args) throws java.io.IOException {
		char x;
		x = (char) System.in.read();
		int y = x;
		if (y <= 90) x += 32;
		else x -= 32;
		System.out.println(x);

	}
}
