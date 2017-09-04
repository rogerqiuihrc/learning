package prototype;


public class ProtototypeTester {
	
	public static void main(String[] args) {
		
		DriverManager manger = new DriverManager();
		manger.Run(new ManDriver("roger"), new FordCar());
		manger.Run(new ManDriver("roger"), new BenzCar());
		manger.Run(new ManDriver("qxy"), new BenzCar());
	}
	

}
