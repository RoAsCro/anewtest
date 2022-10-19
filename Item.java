public class Item {
	private int x, y, z;
	private String name;
	private Item nextItem = null, previousItem = null;

	public Item(int x, int y, int z, String name) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.name = name;
	}

	public void setNextItem(Item item) {
		nextItem = item;
	}
	
	public void setPreviousItem(Item item) {
		previousItem = item;
	}

	public Item getNextItem() {
		return nextItem;
	}

	public Item getPreviousItem() {
		return previousItem;
	}

	public void printSelf() {
		System.out.println(name + ": " + x + ", " + y + ", " + z + ";");
	}

	public String getName() {
		return name;
	}
}