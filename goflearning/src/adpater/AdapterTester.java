package adpater;

public class AdapterTester {
	public static void main(String[] args) {
		ShapeManager shapeMgm = new ShapeManager();
		shapeMgm.Draw(new Line());
		shapeMgm.Draw(new Circle());
		shapeMgm.Draw(new RectangeAdapter());

	}

}
