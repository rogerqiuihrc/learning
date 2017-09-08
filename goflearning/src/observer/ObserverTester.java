package observer;

public class ObserverTester {
	public static void main(String[] args) {
		EventService evs = new EventService();
		ClickHandler ch = new ClickHandler();
		ClickHandler ch2 = new ClickHandler();
		MouseMoveEventHandler mh = new MouseMoveEventHandler();
		evs.Subscribe(EventType.ButtonClick, ch);
		evs.Subscribe(EventType.ButtonClick, ch2);
		evs.Subscribe(EventType.MouseClick, mh);
		evs.Publish(EventType.ButtonClick);
	}

}
