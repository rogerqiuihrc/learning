package builder;

public class LaptopBuilder implements ComupterBuilder {

	@Override
	public Computer BuildCompulter() {
		Computer com = new Computer();
		com.setCpuNum(4);	
		com.setMemorySize(2048);
		com.setScreenSize(14);
		System.out.println("create laptop ");
		return com;
	}

}
