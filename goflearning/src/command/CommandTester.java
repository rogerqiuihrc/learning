package command;

public class CommandTester {

	public static void main(String[] args) {
		
		BBQProducer p1 = new BBQProducer("qqb");
		BBQProducer p2 = new BBQProducer("qxy");
		ChickLegCommand c1 = new ChickLegCommand(p1);
		ChickLegCommand c2 = new ChickLegCommand(p2);
		ChickWingCommand c3 = new ChickWingCommand(p1);
		MushroomCommand c4 = new MushroomCommand(p1);
		Waitress w1 = new Waitress();
		w1.Order(c1);
		w1.Order(c2);
		w1.Order(c3);
		w1.Order(c4);
		w1.Notify();
	}

}
