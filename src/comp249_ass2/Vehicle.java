package comp249_ass2;
/**
 * This is an vehicle class 
 * @author sitherankan & paul
 */
public class Vehicle {
private long serialNumber;

/**
 * it is a default constructor of vehicle
 */
public Vehicle() {
	serialNumber=0;
}
/**
 * 
 * @param serialNumber a long value of the serial number
 */
public Vehicle (long serialNumber) {
	this.serialNumber=serialNumber;
}
/**
 * it is a  copy constructor of vehicle
 * 
 * @param vt this is ferry used to copy 
 */
public Vehicle (Vehicle vt) {
	this.serialNumber= vt.serialNumber;
}
/**
 * 
 * @return a long type that gives the serial number
 */
public long getSerialNumber() {
	return serialNumber;
}
/**
 * 
 * @param serialNumber a long type of the serial number
 */
public void setSerialNumber(long serialNumber) {
	this.serialNumber = serialNumber;
}

@Override
/**
 * a string that gives the object information
 */
public String toString() {
	return "This Vehicle - serial#" + serialNumber ;
}



}


