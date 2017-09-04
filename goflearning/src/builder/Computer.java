package builder;

public class Computer {
	private int ScreenSize;
	private int CpuNum;
	private int MemorySize;
	public Computer() {
		System.out.println("I am computer");
	}
	public void Calculate()
	{
		System.out.println("I am calculating");
	}
	public int getScreenSize() {
		return ScreenSize;
	}
	public void setScreenSize(int screenSize) {
		ScreenSize = screenSize;
	}
	public int getCpuNum() {
		return CpuNum;
	}
	public void setCpuNum(int cpuNum) {
		CpuNum = cpuNum;
	}
	public int getMemorySize() {
		return MemorySize;
	}
	public void setMemorySize(int memorySize) {
		MemorySize = memorySize;
	}

}
