package factory;

public class FactoryTester {

	public static void main(String[] args) {
		AFactory curFac = new CommonToolFactory();
		curFac.CreateProductA();
		curFac.CreateProductB();
		
		curFac = new EnhToolFactory();
		curFac.CreateProductA();
		curFac.CreateProductB();

	}

}
