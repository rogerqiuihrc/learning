package command;

public class ChickWingCommand extends BillCommand {

	public ChickWingCommand(BBQProducer cook) {
		super(cook);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Execute() {
		getCook().MakeChickWing();

	}

}
