// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
package fifthPackage;

import firstPackage.WheeledTransportation;
import comp249_ass2.Vehicle;
/**
 * This is an aircraft class that extends from Vehicle in fifth package
 * @author sitherankan & paul
 */
public class Aircraft extends Vehicle {
	private double price;
	private double maxElevation;
	
	/**
	 * it is a default constructor of Aircraft
	 */
	public Aircraft() {
		super();
		price=0;
		maxElevation=0;
		
	}
	/**
	 * it is a  parameterized constructor of Monowheel 
	 * 
	 * @param price it is a double value of the price
	 * @param maxElevation it is the double value of the maximum elevation
	 */
	public Aircraft (double price,double maxElevation) {
		super();
		this.price=price;
		this.maxElevation=maxElevation;
		
		
	}
	/**
	 * it is a  copy constructor of tram
	 * 
	 * @param ac this is aircraft used to copy 
	 */
	public Aircraft(Aircraft ac) {
		super(ac.getSerialNumber()+1);
		this.maxElevation=ac.maxElevation;
		this.price=ac.price;
		
	}
	/**
	 * 
	 * @return a double value that gives the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * 
	 * @param price a double value of the price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * 
	 * @return a double value that gives the max elevation
	 */
	public double getMaxElevation() {
		return maxElevation;
	}
	/**
	 * 
	 * @param maxElevation a double value of the max elevation
	 */
	public void setMaxElevation(double maxElevation) {
		this.maxElevation = maxElevation;
	}

	
	@Override
	/**
	 * a string that gives the object information
	 */
	public String toString() {
		return "This Aircraft - serial#" + this.getSerialNumber() + "- has a price of "+ price+ "$ and a maximum elevation of "+ maxElevation+".";
	}
	/**
	 * this is a equals method that compares a aircraft to any input of the user
	 * @param x an object that wished to be compared
	 * @return boolean if they have the same class and same attribute values
	 */
	public boolean equals(Object x) {
		if((x== null)||(this.getClass()!=x.getClass()) ) 
			return false;
		else {
			Aircraft y= (Aircraft) x;
			if(this.price==y.price && this.maxElevation==y.maxElevation) 
				return true;
			else 
				return false;
			
		}
		
	}
	
	

}
