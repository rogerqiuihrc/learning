package chain;

public class L2Manager extends RequestHandler {

	public L2Manager(RequestHandler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean HandleRequest(OARequest request) {
		System.out.println("The request entering L2");
		if(request.getRequestLevel() == RequestLevel.L2)
		{
			System.out.println("The request is approved by L2");
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
