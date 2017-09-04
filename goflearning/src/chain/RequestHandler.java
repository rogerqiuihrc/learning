package chain;

public abstract class RequestHandler {
	abstract boolean HandleRequest(OARequest request);
	protected RequestHandler _nextHandler = null;
	public RequestHandler(RequestHandler next)
	{
		_nextHandler = next;
	}
	
}
