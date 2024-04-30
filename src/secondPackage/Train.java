// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
package secondPackage;

import firstPackage.WheeledTransportation;

/**
 * This is an train class that extends from wheeledtransportation in first package
 * @author sitherankan & paul
 */
public class Train extends WheeledTransportation{
	
	private int numberOfVehicles;
	private String startingStation;
	private String destinationStation;
	private static long trainSerialNumber=10000;
	/**
	 * it is a default constructor of train
	 */
	public Train() {
		super();
		numberOfVehicles=0;
		startingStation="";
		destinationStation="";
		this.setSerialNumber(trainSerialNumber);
		trainSerialNumber++;
	}
	/**
	 * it is a  parameterized constructor of WheeledTransportation
	 * 
	 * @param numberOfWheels this is the number of wheels
	 * @param maxSpeed this is the number of speed
	 * @param numberOfVehicles this is the number of vehicles
	 * @param startingStation this is the name of the starting station
	 * @param destinationStation this is the name of the final destination
	 */
	public Train(int numberOfWheels, double maxSpeed,int numberOfVehicles, String startingStation, String destinationStation ) {
		super(numberOfWheels, maxSpeed);
		this.numberOfVehicles= numberOfVehicles;
		this.destinationStation=destinationStation;
		this.startingStation=startingStation;
		this.setSerialNumber(trainSerialNumber);
		trainSerialNumber++;	
	}
	/**
	 * it is a  copy constructor of train
	 * 
	 * @param tr this is train used to copy 
	 */
	public Train(Train tr) {
		super(tr);
		this.numberOfVehicles= tr.numberOfVehicles;
		this.destinationStation=tr.destinationStation;
		this.startingStation=tr.startingStation;
		this.setSerialNumber(trainSerialNumber);
		trainSerialNumber++;
	}
	/**
	 * @return a long type that gives the serial Number for train
	 */
	public static long getNextSerialNumber() {
		return trainSerialNumber;
	}
	/**
	 * 
	 * @return a integer type that gives the number of vehicles
	 */
	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}
	/**
	 * 
	 * @param numberOfVehicles a integer value of number of vehicles
	 */
	public void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}
	/**
	 * 
	 * @return a string type of starting station
	 */
	public String getStartingStation() {
		return startingStation;
	}
	/**
	 * 
	 * @param startingStation a string value of starting Station
	 */
	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}
	/**
	 * 
	 * @return a string type that gives the final destination
	 */
	public String getDestinationStation() {
		return destinationStation;
	}
	/**
	 * 
	 * @param destinationStation a string value of the final destination
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	@Override
	/**
	 * a string that gives the object information
	 */
	public String toString() {
		return "This Train - serial #" + this.getSerialNumber() + "- has " + this.getNumberOfWheels()+ " wheels, has a maximum speed of "+ this.getMaxSpeed()+ " km/hr. It has "+ numberOfVehicles+ " vehicles and its starting and destination stations are "+ startingStation +" and "+  destinationStation+". ";
	}
	/**
	 * this is a equals method that compares a train to any input of the user
	 * @param x an object that wished to be compared
	 * @return boolean if they have the same class and same attribute values
	 */
	public boolean equals(Object x) {
		if((x== null)||(this.getClass()!=x.getClass()) )
			return false;
		else {
			Train y= (Train) x;
			if(this.getMaxSpeed()==y.getMaxSpeed() && this.getNumberOfWheels()==y.getNumberOfWheels() && this.numberOfVehicles==y.numberOfVehicles && this.startingStation==y.startingStation && this.destinationStation== y.destinationStation ) 
				return true;
			else 
				return false;
			
		}
	}
	
}
