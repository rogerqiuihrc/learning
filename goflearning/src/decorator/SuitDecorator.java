package decorator;

public class SuitDecorator extends PersonClothDecorator {
	public SuitDecorator() {
	
	}
	
	@Override
	public void DateOut() {
		PutOnSuit();
		super.DateOut();
	}
	
	public void PutOnSuit() {
		System.out.println("I am wearing with suit");		
	}

}

