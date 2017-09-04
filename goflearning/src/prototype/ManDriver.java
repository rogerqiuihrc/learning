package prototype;

public class ManDriver extends Driver {

	public ManDriver(String name)
	{
		Name=name;
	}
	@Override
	public void Drive(Car car) {
		System.out.println("I am man driver with " + Name);
		car.Run();
		
	}
	public Driver Clone()
	{
		return new ManDriver(this.getName());
	}

}
