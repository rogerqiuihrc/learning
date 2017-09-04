package decorator;

public class DecoratorTester {

	public static void main(String[] args) {
		Person c1 = new Person();
		
		SuitDecorator d1 = new SuitDecorator();
		PantDecorator d2 = new PantDecorator();
		d1.setPerson(c1);
		//d1.DateOut();
		d2.setPerson(d1);
		d2.DateOut();

	}

}
