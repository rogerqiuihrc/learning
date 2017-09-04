package chain;

public class SeniorManager extends RequestHandler {

	public SeniorManager(RequestHandler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean HandleRequest(OARequest request) {
		System.out.println("The request entering senior");
		if(request.getRequestLevel() == RequestLevel.Senior)
		{
			System.out.println("The request is approved by Senior");
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
