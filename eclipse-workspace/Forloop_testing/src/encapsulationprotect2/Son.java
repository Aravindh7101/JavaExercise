package encapsulationprotect2;

import encasulationprotected.Owner;

public class Son extends Owner {  // this is single inheritence
	public static void main(String[] args) {
		Son ownobj = new Son();
		ownobj.fruit();
		ownobj.apple();
	}
	/*
	 * -----Defauld Access specifier or Package level spaecifier---
	 * 
	 * same package method or class only accepted and another packge not accepte
	 * same package data type and method accepted Default access specifier mean
	 * Customer(){ void print(){ } void copy(){} //i will be access infront of no
	 * access modifier } Default acces for 1.Public 2.Final 3.Abstract 4.Default it
	 * also access class name Protected class Extents key word used for Protected
	 * classs acess
	 * 
	 * exxx .... child extents parents
	 * 
	 * child one pacakge and parents another packge so the both class access only
	 * extents keyword
	 * 
	 * extents == INHERITENCE
	 * 
	 * 1. Public == in sampe package all classes accepted 
	 * 2. Private == within the class only accepted 
	 * 3. Default == without acces modifier
	 * class only accepted and also accepted for "FINAL,ABSTRCTION , DEFAULT PUBLIC"
	 * 4.Protected === Another package class accpted but we should use extents key
	 * word
	 */
}
