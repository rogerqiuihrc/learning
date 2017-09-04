package command;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
	private List<BillCommand> _Orders = new ArrayList<BillCommand>();
	public void Order(BillCommand cmd)
	{
		_Orders.add(cmd);
	}

	public void Notify()
	{
		_Orders.forEach(o->o.Execute());
	}

}
