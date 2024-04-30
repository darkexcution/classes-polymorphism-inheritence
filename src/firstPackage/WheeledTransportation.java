// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------



package firstPackage;
import comp249_ass2.Vehicle;
/**
 * This is an WheeledTransportation class that extends from Vehicle in first package
 * @author sitherankan & paul
 */
public class WheeledTransportation extends Vehicle {
	
	private int numberOfWheels;
	private double maxSpeed;
	
	/**
	 * it is a default constructor of WheeledTransportation
	 */
	public WheeledTransportation() {
		super();
		numberOfWheels=0;
		maxSpeed=0;
		
	}
	/**
	 * it is a  parameterized constructor of WheeledTransportation
	 * 
	 * @param numberOfWheels this is the number of wheels
	 * @param maxSpeed this is the number of speed
	 */
	public WheeledTransportation(int numberOfWheels, double maxSpeed) {
		super();
		this.numberOfWheels=numberOfWheels;
		this.maxSpeed=maxSpeed;
		
		
	}
	/**
	 * it is a  copy constructor of WheeledTransportation
	 * 
	 * @param wt this is WheeledTransportation used to copy 
	 */
	public WheeledTransportation(WheeledTransportation wt) {
		super(wt.getSerialNumber()+1);
		this.maxSpeed=wt.maxSpeed;
		this.numberOfWheels=wt.numberOfWheels;
		
	}
	/**
	 * 
	 * @return a integer of number of wheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	/**
	 * 
	 * @param numberOfWheels a integer value of number of wheels
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	/**
	 * 
	 * @return a double type of maximum speed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}
	/**
	 * 
	 * @param maxSpeed a double value of maximum speed
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	@Override
	/**
	 * a string that gives the object information
	 */
	public String toString() {
		return "This Wheeled Transportation - serial #" + this.getSerialNumber() + "- has " +numberOfWheels+ " wheels, has a maximum speed of "+ maxSpeed+ " km/hr.";
	}
	/**
	 * this is a equals method that compares a WheeledTransportation to any input of the user
	 * @param x an object that wished to be compared
	 * @return boolean if they have the same class and same attribute values
	 */
	public boolean equals(Object x) {
		if((x== null)||(this.getClass()!=x.getClass()) )
			return false;
		else {
			WheeledTransportation y= (WheeledTransportation) x;
			if(this.maxSpeed==y.maxSpeed && this.numberOfWheels==y.numberOfWheels) 
				return true;
			else 
				return false;
			
		}
		
	}
	
}




