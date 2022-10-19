public class Request {
	private final int num;
	private Request nextRequest = null;	

	public Request(int a) {
		num = a;
	}

	public int getNum() {
		return num;
	}

	public Request getNextRequest() {
		return nextRequest;
	}

	public void setNextRequest(Request request) {
		nextRequest = request;
	}
}