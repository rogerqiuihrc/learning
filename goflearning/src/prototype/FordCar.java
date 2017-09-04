package prototype;

public class FordCar extends Car{
	public FordCar()
	{
		Logo = "BenZ";
	}
	@Override
	public void Run() {
		System.out.println("I am running is speed 110 ");
		
	}
	@Override
	public Car Clone() {
		
		return new FordCar();
	}


}
