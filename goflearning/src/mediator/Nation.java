package mediator;

public class Nation {
	private UniteNation _UN;
	private String _Name;
	public Nation(UniteNation un,String name)
	{
		setUN(un);
		setName(name);
	}
	public void Notify(String msg)
	{
		System.out.println(_Name + " receive msg: " + msg);
	}
	public UniteNation getUN() {
		return _UN;
	}
	public void setUN(UniteNation _UN) {
		this._UN = _UN;
	}
	public String getName() {
		return _Name;
	}
	public void setName(String _Name) {
		this._Name = _Name;
	}
}
