package prototype;

public class DriverManager {
	private Driver curDriver;
	private Car    curCar;
	public DriverManager()
	{
		
		
	}
	public void Run(Driver drv, Car car)
	{
		curDriver = drv.Clone();
		curCar = car.Clone();
		curDriver.Drive(curCar);
	}

}
