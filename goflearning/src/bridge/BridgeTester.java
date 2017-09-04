package bridge;

public class BridgeTester {

	public static void main(String[] args) {
		Mobile androidMobile = new MobileA(new CallerForAndroid());
		Mobile iosMobile = new MobileI(new CallerForIos());
		androidMobile.Call();
		iosMobile.Call();

	}

}
