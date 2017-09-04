package builder;

public class BuilderTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComupterBuilder curBuilder = new LaptopBuilder();
		Computer com = curBuilder.BuildCompulter();		
		com.Calculate();

	}

}
