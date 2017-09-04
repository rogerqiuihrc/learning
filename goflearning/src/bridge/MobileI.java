package bridge;

public class MobileI extends Mobile {

	public MobileI(InfCallerSoft caller) {
		super(caller);
		
	}

	@Override
	public void Call() {
		_Caller.Call();

	}

}
