package decorator;

public class PantDecorator extends PersonClothDecorator {	
	
	@Override
	public void DateOut() {
		PutOnPant();
		super.DateOut();
	}
	
	public void PutOnPant() {
		System.out.println("I am wearing a pant");		
	}

}
