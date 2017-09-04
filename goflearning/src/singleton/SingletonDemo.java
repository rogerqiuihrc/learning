package singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonDemo {
	private static SingletonDemo _Instance;
	private static Map<String,SingletonDemo> _ObjMap = new HashMap<String,SingletonDemo>();
	public  static void Register(String name,SingletonDemo obj)
	{
		if(!_ObjMap.containsKey(name))
			_ObjMap.put(name, obj);
	}
	public static synchronized SingletonDemo Instance(String name)
	{
		
		if(_ObjMap.containsKey(name))
			_Instance = _ObjMap.get(name);
		
		return _Instance;
	}
	protected SingletonDemo() {}
	public void Test()
	{
		System.out.println("I am in singleton test function");
	}

}
