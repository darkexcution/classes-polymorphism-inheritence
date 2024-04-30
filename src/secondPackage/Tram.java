// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
package secondPackage;

import thirdPackage.Metro;
/**
 * This is an tram class that extends from metro in third package
 * @author sitherankan & paul
 */

public class Tram extends Metro {
	private int yearOfCreation;
	private static long tramSerialNumber=30000;
	/**
	 * it is a default constructor of Tram
	 */
	public Tram() {
		super();
		yearOfCreation=0;
		this.setSerialNumber(tramSerialNumber);
		tramSerialNumber++;
	}
	/**
	 * it is a  parameterized constructor of tram
	 * 
	 * @param numberOfWheels this is the number of wheels
	 * @param maxSpeed this is the number of speed
	 * @param maximumWeight this is the maximum weight 
	 */ 
	public Tram(int numberOfWheels, double maxSpeed,int numberOfVehicles, String startingStation, String destinationStation,int numberOfStops,int yearOfCreation) {
		super(numberOfWheels, maxSpeed,numberOfVehicles,startingStation, destinationStation, numberOfStops);
		this.yearOfCreation=yearOfCreation;
		this.setSerialNumber(tramSerialNumber);
		tramSerialNumber++;
		
	}
	/**
	 * it is a  copy constructor of tram
	 * 
	 * @param tm this is tram used to copy 
	 */
	public Tram (Tram tm) {
		super(tm);
		this.yearOfCreation=tm.yearOfCreation;
		this.setSerialNumber(tramSerialNumber);
		tramSerialNumber++;
	}
	/**
	 * 
	 * @return a long type of serial Number for tram
	 */
	public static long getNextSerialNumber() {
		return tramSerialNumber;
	}
	/**
	 * 
	 * @return a integer type of the year of the creation
	 */
	public int getYearOfCreation() {
		return yearOfCreation;
	}
	/**
	 * 
	 * @param yearOfCreation is an integer year of the creation
	 */
	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
	
	@Override
	/**
	 * a string that gives the object information
	 */
	public String toString() {
		return "This Tram - serial #" + this.getSerialNumber() + "- has " + this.getNumberOfWheels()+ " wheels, has a maximum speed of "+ this.getMaxSpeed()+ " km/hr. It has "+ this.getNumberOfVehicles()+ " vehicles, its starting and destination stations are "+ this.getStartingStation() +" and "+  this.getDestinationStation() + " and it has "+ this.getNumberOfStops()+" stops. It was created in "+yearOfCreation+". ";
	}
	/**
	 * this is a equals method that compares a tram to any input of the user
	 * @param x an object that wished to be compared
	 * @return boolean if they have the same class and same attribute values
	 */
	public boolean equals(Object x) {
		if((x== null)||(this.getClass()!=x.getClass()) )
			return false;
		else {
			Tram y= (Tram) x;
			if(this.getMaxSpeed() == y.getMaxSpeed() && this.getNumberOfWheels() == y.getNumberOfWheels() && this.getNumberOfVehicles()==y.getNumberOfVehicles() && this.getStartingStation() == y.getStartingStation() && this.getDestinationStation() == y.getDestinationStation() && this.getNumberOfStops() == y.getNumberOfStops() && this.yearOfCreation == y.yearOfCreation) 
				return true;
			else 
				return false;
			
		}
	}
	
	
}
