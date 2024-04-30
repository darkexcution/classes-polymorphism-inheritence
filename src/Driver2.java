// -----------------------------------------------------
// Assignment 1
// Part: 2
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------

import fifthPackage.Aircraft;
import fifthPackage.WorldWar2Airplane;
import firstPackage.WheeledTransportation;
import secondPackage.Train;
import secondPackage.Tram;
import thirdPackage.Metro;
import fourthPackage.Monowheel;
import sixthPackage.Ferry;
import comp249_ass2.Vehicle;
/**
 * This is an driver
 * @author sitherankan & paul
 */
public class Driver2 {
	
/**
 * 
 * @param x an vehicle that wants to be copied
 * @return the copy of the objects
 */
public static Vehicle[] copyTheObjects(Vehicle[]x) {
	Vehicle[] copy = new Vehicle[x.length];
	
	
	for(int i=0; i<x.length;i++) {
		copy[i]= new Vehicle(x[i]);
	}
	return copy;
}


	public static void main(String[] args) {
		
		Vehicle [] arrayVehicle = new Vehicle[15];
		arrayVehicle[0]=new WheeledTransportation(2,5);
		arrayVehicle[1]=new WheeledTransportation(3,5);
		arrayVehicle[2]=new Train(2,5,3,"Toronto","Montreal");
		arrayVehicle[3]=new Train (7,8,10,"Bangcock","Dickland");
		arrayVehicle[4]=new Metro(20,70,10,"Mtl","TOR",20);
		arrayVehicle[5]=new Metro(30,50,20,"laval","Cv",40);
		arrayVehicle[6]=new Tram(10,20,30,"Snowden","Concordia",30,2000);
		arrayVehicle[7]=new Tram(20,3,40,"Mcgill","hell",40,2060);
		arrayVehicle[8]=new Monowheel(69,30,100);
		arrayVehicle[9]=new Monowheel(20,30,50);
		arrayVehicle[10]=new Ferry(30,69);
		arrayVehicle[11]=new Ferry(89,40);
		arrayVehicle[12]=new Aircraft(999,1000);
		arrayVehicle[13]=new Aircraft(999,1000);
		arrayVehicle[14]=new  WorldWar2Airplane(1,20,true);
		
		Vehicle []x= copyTheObjects(arrayVehicle);
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		

	}

}
