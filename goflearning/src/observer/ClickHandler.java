package observer;

public class ClickHandler extends EventHandler {

	@Override
	public boolean Handle() {
		System.out.println("Handler ClickEvent");
		return false;
	}

}
