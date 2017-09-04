package facade;

public class SubFacade {
	private SubsystemA A = new SubsystemA();
	private SubsystemB B = new SubsystemB();
	private SubsystemC C = new SubsystemC();
	public void Method()
	{
		A.MethodA();
		B.MethodB();
		C.MethodC();
	}

}
