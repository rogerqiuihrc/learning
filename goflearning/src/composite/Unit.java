package composite;

import java.util.ArrayList;
import java.util.List;

abstract public class Unit {
	abstract public int GetPrice();
	protected List<Unit> _SubUnit = new ArrayList<Unit>();
	abstract public void Add(Unit unit);
	abstract public void Del(Unit unit);
	private String _Name;
	public Unit(String name)
	{
		_Name = name;
	}
	public String getName() {
		return _Name;
	}	
	
	
}
