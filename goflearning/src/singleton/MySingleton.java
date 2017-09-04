package singleton;

public class MySingleton extends SingletonDemo{
	
	public MySingleton()
	{
		SingletonDemo.Register("MySingleton", this);		
	}
	public void Test()
	{
		System.out.println("I am in MySingleton test function");
	}
}
