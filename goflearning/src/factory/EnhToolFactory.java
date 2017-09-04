package factory;

public class EnhToolFactory implements AFactory{

	@Override
	public ProductA CreateProductA() {
		// TODO Auto-generated method stub
		return new CalculatorEnh();
	}

	@Override
	public ProductB CreateProductB() {
		// TODO Auto-generated method stub
		return new PencilEnh();
	}

}
