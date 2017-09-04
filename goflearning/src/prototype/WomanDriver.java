package prototype;

public class WomanDriver extends Driver {

	public WomanDriver(String name)
	{
		Name=name;
	}
	@Override
	public void Drive(Car car) {
		System.out.println("I am woman driver with " + Name);
		car.Run();
		
	}
	public Driver Clone()
	{
		return new WomanDriver(this.getName());
	} 

}
