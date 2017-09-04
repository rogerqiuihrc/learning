package prototype;

public class BenzCar extends Car {

	public BenzCar()
	{
		Logo = "BenZ";
	}
	@Override
	public void Run() {
		System.out.println("I am running is speed 160 ");
		
	}
	@Override
	public Car Clone() {
		
		return new BenzCar();
	}

}
