
public class Point {
	public int x,y,z;
	
	public Point() {
		x=0;
		y=0;
		z=0;
	}
	
	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	

}
