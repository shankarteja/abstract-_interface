package interface_abstract;

public class Rangerover implements Showroom {

	@Override
	public void redrace() {
		System.out.println(" red race milage 20km");
		
	}

	@Override
	public void yellowrace() {
		System.out.println(" yellow race milage 30km");
		
	}

	@Override
	public void greenrace() {
		System.out.println(" green race milage 40km");
		
	}

	@Override
	public void purplerace() {
		System.out.println(" purple race milage 50km");
		
		
	}
	public static void speedlimit() {
		System.out.println("speed limit  to over");
	}
}
