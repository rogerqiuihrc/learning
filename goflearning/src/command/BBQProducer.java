package command;

public class BBQProducer {
	private String Name;
	public BBQProducer(String name)
	{
		Name = name;
	}
	public void MakeMushRoom()
	{
		System.out.println("Make a mush room");
	}
	
	public void MakeChickWing()
	{
		System.out.println("Make chick wing");
	}
	
	public void MakeChickLeg()
	{
		System.out.println("Make chick leg");
	}
	
	public String getName() {
		return Name;
	}

}
