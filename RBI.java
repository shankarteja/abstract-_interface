package interface_abstract;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;

public abstract class RBI {
	int x;
	int y;
	static int z=10;
	public RBI(int x, int y) {

		this.x = x;
		this.y = y;
	}
	public void createacc() {
		System.out.println("RBi:create account");
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public static int getZ() {
		return z;
	}
	
	public void processloan() {
		System.out.println("RBI:loan successfully proceed");
	}
	public abstract void createppf();
}
