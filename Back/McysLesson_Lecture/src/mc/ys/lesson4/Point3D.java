package mc.ys.lesson4;

public class Point3D extends Point {
	private int z;
	
	public Point3D(int x , int y , int z) {
		
		super(x,y);
		this.z = z;
		
		
	}
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return String.format("%3d %3d %3d",x,y,z);
	}
}
