package bridge;

public class MobileA extends Mobile {

	public MobileA(InfCallerSoft caller) {
		super(caller);		
	}

	@Override
	public void Call() {
		_Caller.Call();

	}

}
