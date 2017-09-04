package chain;

public class L1Manager extends RequestHandler {

	public L1Manager(RequestHandler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean HandleRequest(OARequest request) {
		System.out.println("The request entering L1");
		if(request.getRequestLevel() == RequestLevel.L1)
		{
			System.out.println("The request is approved by L1");
			return true;
		}
		else
		{
			if(_nextHandler != null)
				return _nextHandler.HandleRequest(request);
		}
		return false;
	}

}
