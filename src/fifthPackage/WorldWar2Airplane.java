// -----------------------------------------------------
// Assignment 1
// Part: The classes
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
package fifthPackage;
/**
 * This is an world war 2 airplane class that extends from aircraft in fifth package
 * @author sitherankan & paul
 */
public class WorldWar2Airplane extends Aircraft {
	private boolean twinEngine;
	private static long WW2SN=80000;
	/**
	 * it is a default constructor of world war 2 airplane
	 */
	public WorldWar2Airplane() {
		super();
		twinEngine=false;
		this.setSerialNumber(WW2SN);
		WW2SN++;
	}
	/**
	 * it is a  parameterized constructor of Monowheel 
	 * 
	 * @param price it is a double value of the price
	 * @param maxElevation it is the double value of the maximum elevation
	 * @param twinEngine it is the boolean value if it has a twin engine
	 */
	public WorldWar2Airplane(double price,double maxElevation,boolean twinEngine) {
		super(price,maxElevation);
		this.twinEngine=twinEngine;
		this.setSerialNumber(WW2SN);
		WW2SN++;
	}
	/**
	 * it is a  copy constructor of world war 2 airplane
	 * 
	 * @param ww2 this is world war 2 airplane used to copy 
	 */
	public WorldWar2Airplane(WorldWar2Airplane WW2) {
		super(WW2);
		this.twinEngine=WW2.twinEngine;
		this.setSerialNumber(WW2SN);
		WW2SN++;
	}
	/**
	 * 
	 * @return a long type that gives the serial number
	 */
	public static long getNextSerialNumber() {
		return WW2SN;
	}
	/**
	 * 
	 * @return a boolean value type that gives the twin engine
	 */
	public boolean isTwinEngine() {
		return twinEngine;
	}
	/**
	 * 
	 * @param twinEngine boolean that tells if it is a twin engine or not
	 */
	public void setTwinEngine(boolean twinEngine) {
		this.twinEngine = twinEngine;
	}

	@Override
	/**
	 * a string that gives the object information
	 */
	public String toString() {
		return "This World War 2 Airplane - serial#" + this.getSerialNumber() + "- has a twin Engine: " +twinEngine+ ", has a price of "+ this.getPrice()+ "$ and a maximum elevation of "+ this.getMaxElevation()+".";
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
			WorldWar2Airplane y= (WorldWar2Airplane) x;
			if( this.getPrice()==y.getPrice() && this.getMaxElevation()==y.getMaxElevation() && this.twinEngine == y.twinEngine) 
				return true;
			else 
				return false;
			
		}
		
	}
	
}
