package composite;

import java.util.Iterator;

public class ContainerUnit extends Unit {

	public ContainerUnit(String name) {
		super(name);		
	}

	@Override
	public int GetPrice() {
		int sum = 0;
		for(Unit u :_SubUnit)
		{
			sum += u.GetPrice();
		}
		
		return sum;
	}

	@Override
	public void Add(Unit unit) {
		_SubUnit.add(unit);
	}

	@Override
	public void Del(Unit unit) {
		
		Iterator<Unit> unitIterator = _SubUnit.iterator();  
		while(unitIterator.hasNext()){  
		    Unit u = unitIterator.next();  
		    if(u == unit){  
		    	unitIterator.remove();  
		    	break;
		    }  
		}  
	}

}
