package bridge;

abstract public class Mobile {
	abstract public void Call(); 
	InfCallerSoft _Caller;
	public Mobile(InfCallerSoft caller)
	{
		_Caller = caller;
	}
}
