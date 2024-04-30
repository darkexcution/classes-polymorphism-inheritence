// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
package thirdPackage;

import secondPackage.Train;
/**
 * This is an metro class that extends from train in third package
 * @author sitherankan & paul
 */

public class Metro extends Train{
	private int numberOfStops;
	private static long metroSerialNumber=25000;
	/**
	 * it is a default constructor of metro
	 */
	public Metro() {
		super();
		numberOfStops=0;
		this.setSerialNumber(metroSerialNumber);
		metroSerialNumber++;
	}
	/**
	 * it is a  parameterized constructor of WheeledTransportation
	 * 
	 * @param numberOfWheels this is the number of wheels
	 * @param maxSpeed this is the number of speed
	 * @param numberOfVehicles this is the number of vehicles
	 * @param startingStation this is the name of the starting station
	 * @param destinationStation this is the name of the final destination
	 * @param  numberOfStops this is the number of stops 
	 */
	public Metro(int numberOfWheels, double maxSpeed,int numberOfVehicles, String startingStation, String destinationStation,int numberOfStops) {
		super(numberOfWheels, maxSpeed,numberOfVehicles,startingStation, destinationStation);
		this.numberOfStops=numberOfStops;
		this.setSerialNumber(metroSerialNumber);
		metroSerialNumber++;
		
	}
	/**
	 * it is a  copy constructor of metro
	 * 
	 * @param mt this is metro used to copy 
	 */
	public Metro(Metro mt) {
		super(mt);
		this.numberOfStops=mt.numberOfStops;
		this.setSerialNumber(metroSerialNumber);
		metroSerialNumber++;	
	}
	/**
	 * @return a long type that gives the serial Number for metro
	 */
	public static long getNextSerialNumber() {
		return metroSerialNumber;
	}
	/**
	 * 
	 * @return a int type that gives the number of stops
	 */
	public int getNumberOfStops() {
		return numberOfStops;
	}
	/**
	 * 
	 * @param numberOfStops a int type of number of stops
	 */
	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}	
	
	@Override
	/**
	 * a string that gives the object information
	 */
	public String toString() {
		return "This Metro - serial #" + this.getSerialNumber() + "- has " + this.getNumberOfWheels()+ " wheels, has a maximum speed of "+ this.getMaxSpeed()+ " km/hr. It has "+ this.getNumberOfVehicles()+ " vehicles, its starting and destination stations are "+ this.getStartingStation() +" and "+  this.getDestinationStation() + " and it has "+ numberOfStops+" stops.";
	}
	/**
	 * this is a equals method that compares a metro to any input of the user
	 * @param x an object that wished to be compared
	 * @return boolean if they have the same class and same attribute values
	 */
	public boolean equals(Object x) {
		if((x== null)||(this.getClass()!=x.getClass()) )
			return false;
		else {
			Metro y= (Metro) x;
			if(this.getMaxSpeed()==y.getMaxSpeed() && this.getNumberOfWheels()==y.getNumberOfWheels() && this.getNumberOfVehicles()==y.getNumberOfVehicles() && this.getStartingStation()==y.getStartingStation() && this.getDestinationStation()== y.getDestinationStation() && this.numberOfStops == y.numberOfStops) 
				return true;
			else 
				return false;
			
		}
	}
	
}

