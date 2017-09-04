package mediator;

public class MediatorTester {

	public static void main(String[] args) {
		G5Group g5= new G5Group();
		China chn = (China) g5.GetNation("China");
		USA usa = (USA) g5.GetNation("USA");
		g5.Send("Hello USA", usa);
		g5.Send("Hello china", chn);
		g5.Send("You are idlot", usa);
	}

}
