public class ListManager {
	private Item firstItem = null, lastItem = null;

	public static void main(String[] args) {
		ListManager manager = new ListManager();
		manager.run();
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			Item item = new Item(i, i*2, i*5, "Blegh" + i);
			addItem(item);
		}
		printList();
		System.out.println(getLength());
		deleteItem("Blegh0");
		System.out.println(getLength());
		deleteItem("Blegh9");
		printList();
		System.out.println(getLength());
		Item item = new Item(15, 1254, 231, "Bleeeee");
		addItem(item);
		deleteItem("ASD");
		printList();

	}

	public void addItem(Item item) {
		Item currentItem = firstItem;
		boolean go = true;
		if (firstItem == null) firstItem = item;
		else while (go) {
			if (currentItem == lastItem) {
				currentItem.setNextItem(item);
				item.setPreviousItem(currentItem);
				break;
			}
			else currentItem = currentItem.getNextItem();
		}
		lastItem = item;
		firstItem.setPreviousItem(item);
		item.setNextItem(firstItem);
	}

	public void printList() {
		Item currentItem = firstItem;
		boolean go = true;
		if (currentItem == null) {
			System.out.println("List is empty");
			go = false;
		}
		else while (go) {
			currentItem.printSelf();
			if (currentItem == lastItem) break;
			else currentItem = currentItem.getNextItem();
		}
		while (go) {
			currentItem.printSelf();
			if (currentItem == firstItem) break;
			currentItem = currentItem.getPreviousItem();
		}
	
	}


	public void deleteItem(String name) {
		Item currentItem = firstItem;
		boolean go = true;
		if (firstItem == null) {
			System.out.println("Item not found");
			go = false;
		}

		if (firstItem.getName().equals(name)) {
			firstItem = firstItem.getNextItem();
		}		
		while (go) {
			Item nextItem = currentItem.getNextItem(), previousItem = currentItem.getPreviousItem();
			
			if (currentItem.getName().equals(name)) {
				previousItem.setNextItem(nextItem);
				nextItem.setPreviousItem(previousItem);
				if (currentItem == lastItem) lastItem = previousItem;
				break;
				
			} else if (currentItem == lastItem) {
				System.out.println("Item not found");
				break;
			} else currentItem = nextItem;

		}

	}

	public int getLength() {
		Item currentItem = firstItem;
		boolean go = true;
		int count = 0;
		while (go) {
			if (currentItem == lastItem) return count;
			count++;
			currentItem = currentItem.getNextItem();

		}	
		return 0;
	}

}