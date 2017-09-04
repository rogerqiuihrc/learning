package prototype;

public abstract class Driver {	
	protected String Name;
	public String getName() {
		return Name;
	}
	public abstract void Drive(Car car);
	public abstract Driver Clone();

}
