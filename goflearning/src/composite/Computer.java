package composite;

public class Computer extends ContainerUnit{

	public Computer(String name) {
		super("Computer");
	
		super.Add(new Display());		
		Container cnt = new Container();
		cnt.Add(new Cpu());
		cnt.Add(new MainBoard());
		cnt.Add(new HardDisk());
		super.Add(cnt);		
	}

}
