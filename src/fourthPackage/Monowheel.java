// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
package fourthPackage;

import firstPackage.WheeledTransportation;
import secondPackage.Train;
/**
 * This is an Monowheel class that extends from wheeledTransportation in first package
 * @author sitherankan & paul
 */

public class Monowheel extends WheeledTransportation {
	
	private double maximumWeight;
	private static long monowheelSerialNumber=55000;
	
	/**
	 * it is a default constructor of Monowheel
	 */
	public Monowheel() {
		super();
		maximumWeight=0;
		this.setSerialNumber(monowheelSerialNumber);
		monowheelSerialNumber++;
	}
	
	/**
	 * it is a  parameterized constructor of Monowheel
	 * 
	 * @param numberOfWheels this is the number of wheels
	 * @param maxSpeed this is the number of speed
	 * @param maximumWeight this is the maximum weight 
	 */
	public Monowheel (int numberOfWheels, double maxSpeed, double maximumWeight) {
		super(numberOfWheels,maxSpeed);
		this.maximumWeight=maximumWeight;
		this.setSerialNumber(monowheelSerialNumber);
		monowheelSerialNumber++;
	}
	/**
	 * it is a  copy constructor of Monowheel
	 * 
	 * @param mw this is Monowheel used to copy 
	 */
	public Monowheel(Monowheel mw) {
		super(mw);
		this.maximumWeight=mw.maximumWeight;
		this.setSerialNumber(monowheelSerialNumber);
		monowheelSerialNumber++;
	}
	/**
	 * 
	 * @return a long type of serial Number for monowheel
	 */
	public static long getNextSerialNumber() {
		return monowheelSerialNumber;
	}

	/**
	 * @return a double type that gives the maximum weight 
	 */
	public double getMaximumWeight() {
		return maximumWeight;
	}

	/**
	 * @param maximumWeight a double value for the maximun weight
	 */
	public void setMaximumWeight(double maximumWeight) {
		this.maximumWeight = maximumWeight;
	}
	
	@Override
	/**
	 * @return a string that gives the object information
	 */
	public String toString() {
		return "This monowheel - serial #" + this.getSerialNumber() + "- has " + this.getNumberOfWheels()+ " wheels, has a maximum speed of "+ this.getMaxSpeed()+ " km/hr. It weights "+maximumWeight+". ";
	}
	/**
	 * this is a equals method that compares a Monowheel to any input of the user
	 * @param x an object that wished to be compared
	 * @return boolean if they have the same class and same attribute values
	 */
	public boolean equals(Object x) {
		if((x== null)||(this.getClass()!=x.getClass()) )
			return false;
		else {
			Monowheel y= (Monowheel) x;
			if(this.getMaxSpeed()==y.getMaxSpeed() && this.getNumberOfWheels()==y.getNumberOfWheels() && this.maximumWeight == y.maximumWeight) 
				return true;
			else 
				return false;
			
		}
	}
	

}
