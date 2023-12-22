package defaultaccesspecifier;

public class Neighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GardenOwner representative = new GardenOwner();
		representative.mango();
		int value = representative.fruitvalue;
		System.out.println(value);

		// default acces modifier is package level modifier
		/*
		 * -----Default Access specifier or Package level specifier---
		 * 
		 * same package method or class only accepted and another package not accept
		 * same package data type and method accepted Default access specifier mean
		 * Customer(){ void print(){ } void copy(){} //i will be access invariant of no
		 * access modifier } Default acces for 1.Public 2.Final 3.Abstract 4.Default it
		 * also access class name
		 */
	}

}
