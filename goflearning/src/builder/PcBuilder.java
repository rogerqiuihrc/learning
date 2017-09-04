package builder;

public class PcBuilder implements ComupterBuilder{

	@Override
	public Computer BuildCompulter() {
		Computer com = new Computer();
		com.setCpuNum(8);	
		com.setMemorySize(4048);
		com.setScreenSize(24);
		System.out.println("create PC ");
		return com;
	}	
	

}
