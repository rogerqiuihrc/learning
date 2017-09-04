package mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class G5Group extends UniteNation {
	
	private List<Nation> _G5Nations = null;
	public G5Group()
	{
		_G5Nations = new ArrayList<Nation>();
		_G5Nations.add(new China(this));
		_G5Nations.add(new USA(this));
		
	}
	
	@Override
	void Send(String msg, Nation na) {
		if(_G5Nations.contains(na))
		{
			na.Notify(msg);
		}
		else
		{
			System.out.println("There is no nation with name " + na.getName() + " in G5");
		}
	}
	public Nation GetNation(String name)
	{
		List<Nation> nation = _G5Nations.stream().filter(n->n.getName().equals(name)).collect(Collectors.toList());
		if(nation.size() > 0)
		{
			return nation.get(0);
		}
		return null;
	}

}
