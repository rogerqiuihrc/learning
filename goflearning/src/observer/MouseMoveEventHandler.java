package observer;

public class MouseMoveEventHandler extends EventHandler {

	@Override
	public boolean Handle() {
		System.out.println("Mouse Move Event");
		return false;
	}

}
