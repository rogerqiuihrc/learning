package decorator;

public abstract class PersonClothDecorator extends Person {
	private Person _Person;	
	public void setPerson(Person _Person) {
		this._Person = _Person;
	}
	

	
	public void DateOut() {
		if(_Person!=null)
		{
			_Person.DateOut();		
		}
	}

}
