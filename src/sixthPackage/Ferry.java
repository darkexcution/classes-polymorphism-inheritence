// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
package sixthPackage;

import firstPackage.WheeledTransportation;
import comp249_ass2.Vehicle;
/**
 * This is an ferry class that extends from Vehicle in sixth package
 * @author sitherankan & paul
 */
public class Ferry extends Vehicle {
	
	private double maxSpeed;
	private double maxLoad;
	private static long ferrySerialNumber=70000;
	
	/**
	 * it is a default constructor of ferry
	 */
	public Ferry() {
		super(ferrySerialNumber);
		maxSpeed=0;
		maxLoad=0;
		ferrySerialNumber++;
	} 
	/**
	 * it is a  parameterized constructor of ferry 
	 * 
	 * @param maxSpeed double value of the max speed
	 * @param maxLoad a double value of the max load
	 */
	public Ferry(double maxSpeed, double maxLoad) {
		super(ferrySerialNumber);
		this.maxLoad=maxLoad;
		this.maxSpeed=maxSpeed;
		ferrySerialNumber++;
	}
	/**
	 * it is a  copy constructor of ferry
	 * 
	 * @param fy this is ferry used to copy 
	 */
	public Ferry (Ferry fy) {
		super(ferrySerialNumber);
		this.maxLoad=fy.maxLoad;
		this.maxSpeed=fy.maxSpeed;
		ferrySerialNumber++;
	}
	/**
	 * 
	 * @return a long type that gives the serial number
	 */
	public static long getNextSerialNumber() {
		return ferrySerialNumber;
	}
	/**
	 * 
	 * @return a double values that gives the max speed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * 
	 * @param maxSpeed a double type that the max speed
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	/**
	 * 
	 * @return a double value that gives the max load
	 */
	public double getMaxLoad() {
		return maxLoad;
	}
	/**
	 * 
	 * @param maxLoad a double value that gives the max Load
	 */
	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}

	

	@Override
	/**
	 * a string that gives the object information
	 */
	public String toString() {
		return "This Ferry - serial#" + this.getSerialNumber() + "- has a maximum load of "+maxLoad+ " and a maximum speed of "+maxSpeed+".";
	}
	/**
	 * this is a equals method that compares a world war 2 airplane to any input of the user
	 * @param x an object that wished to be compared
	 * @return boolean if they have the same class and same attribute values
	 */
	public boolean equals(Object x) {
		if((x== null)||(this.getClass()!=x.getClass()) )
			return false;
		else {
			Ferry y= (Ferry) x;
			if(this.maxSpeed==y.maxSpeed && this.maxLoad==y.maxLoad) 
				return true;
			else 
				return false;
			
		}
		
	}
	
	
	

}
