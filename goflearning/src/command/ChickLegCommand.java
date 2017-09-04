package command;

public class ChickLegCommand extends BillCommand {

	public ChickLegCommand(BBQProducer cook) {
		super(cook);
		
	}

	@Override
	public void Execute() {
		getCook().MakeChickLeg();

	}

}
