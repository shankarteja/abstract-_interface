package interface_abstract;

import org.ietf.jgss.Oid;

public class Ferrari implements Showroom  {

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
	public void white() {
		System.out.println("white race jet speed");


	}
//	public  void Moto() {
//		System.out.println("moto car highspeed");
//	}
	//	private  void horsespeed() {
	//		System.out.println("horse speed 746");
}
