package command;

public class MushroomCommand extends BillCommand {

	public MushroomCommand(BBQProducer cook) {
		super(cook);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Execute() {
		getCook().MakeMushRoom();
	}

}
