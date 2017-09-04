package factory;

public class CommonToolFactory implements AFactory {

	@Override
	public ProductA CreateProductA() {
		
		return new Calculator();
	}

	@Override
	public ProductB CreateProductB() {
		
		return new Pencil();
	}

}
