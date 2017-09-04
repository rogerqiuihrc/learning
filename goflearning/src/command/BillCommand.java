package command;

abstract public class BillCommand {
	private BBQProducer _Cook;	 
	public BillCommand(BBQProducer cook)
	{
		setCook(cook);
	}
	abstract public void Execute();
	public BBQProducer getCook() {
		return _Cook;
	}
	public void setCook(BBQProducer _Cook) {
		this._Cook = _Cook;
	}
}
