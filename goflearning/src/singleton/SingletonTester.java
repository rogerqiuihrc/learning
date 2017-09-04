package singleton;

public class SingletonTester {
    private static MySingleton curSingleton = new MySingleton();
    private static EnhSingleton enhSingleton = new EnhSingleton();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonDemo.Instance("MySingleton").Test();
		SingletonDemo.Instance("EnhSingleton").Test();
	}

}
