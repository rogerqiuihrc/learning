package singleton;

public class EnhSingleton extends SingletonDemo{
	
	public EnhSingleton()
	{
		SingletonDemo.Register("EnhSingleton", this);		
	}
	public void Test()
	{
		System.out.println("I am in EnhSingleton test function");
	}
}
