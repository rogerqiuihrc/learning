package observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EventService {
	private HashMap<EventType,Collection<EventHandler>> _HandlerMap = new HashMap<EventType,Collection<EventHandler>>();
	public EventService()
	{		
		_HandlerMap.put(EventType.ButtonClick, new HashSet<EventHandler>());
		_HandlerMap.put(EventType.ButtonDoubleClick, new HashSet<EventHandler>());
		_HandlerMap.put(EventType.MouseClick, new HashSet<EventHandler>());
		_HandlerMap.put(EventType.MouseMoveOver, new HashSet<EventHandler>());
		
	}
	public void Subscribe(EventType et,EventHandler eh)
	{
		_HandlerMap.get(et).add(eh);
		
	}
	public void UnSubscribe(EventType et ,EventHandler eh)
	{
		_HandlerMap.get(et).remove(eh);
	}
	public void Publish(EventType et) {
		
		_HandlerMap.get(et).forEach(h->h.Handle());
	}
	

}
