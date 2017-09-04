package prototype;

public abstract class Car {
	protected String Logo;
	public String getLogo() {
		return Logo;
	}
	public abstract void Run();
	public abstract Car Clone();

}
