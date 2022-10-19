public class Queue {
	private Request firstRequest = null;
	private int requestCount = 0;

	public static void main(String args[]) {
		Queue queue = new Queue();
		queue.run();
	}

	public void run() {
		System.out.println("There are " + requestCount + " requests in the queue");
		for (int i = 0; i < 3 ; i++) {
			Request request = new Request((i + 3) * 4);
			insert(request);
		}

		System.out.println("There are " + requestCount + " requests in the queue");
		retrieve();
		retrieve();
		System.out.println("There are " + requestCount + " requests in the queue");		
	}

	public void insert(Request request) {
		System.out.println("Inserting request " + request.getNum() + "...");
		Request currentRequest = firstRequest;
		boolean go = true;
		if (firstRequest == null) {
			firstRequest = request;
			requestCount++;
		}
		else while (go) {
			if (currentRequest.getNextRequest() == null) {
				currentRequest.setNextRequest(request);
				requestCount++;
				break;
			}
			else currentRequest = currentRequest.getNextRequest();
			
		}
	}

	public Request retrieve() {
		System.out.println("Retrieving request " + firstRequest.getNum() + "...");
		Request request = firstRequest;
		firstRequest = firstRequest.getNextRequest();
		requestCount--;
		return request;
	}

	public int size() {
		return requestCount;
	}

}