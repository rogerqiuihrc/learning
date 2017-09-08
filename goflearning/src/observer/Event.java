package observer;

enum EventType{
	ButtonClick,
	ButtonDoubleClick,
	MouseMoveOver,
	MouseClick
}

abstract public class Event {
	private EventType type;
	public Event(EventType t)
	{
		setType(t);
	}
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	abstract public void Handle();
}
