// -----------------------------------------------------
// Assignment 1
// Part: The driver
// Written by: (Sitherankan Sinnappu 40264048)&(Paul Hong Phuc Pham 40264687)
// -----------------------------------------------------
/**
 * This is driver
 * @author sitherankan & paul
 */
package comp249_ass2;

import fifthPackage.Aircraft;
import fifthPackage.WorldWar2Airplane;
import firstPackage.WheeledTransportation;
import secondPackage.Train;
import secondPackage.Tram;
import thirdPackage.Metro;
import fourthPackage.Monowheel;
import sixthPackage.Ferry;


public class Driver {

	public static void main(String[] args) {
		
		
		WheeledTransportation wt = new WheeledTransportation(2,5);
		WheeledTransportation wr= new WheeledTransportation(3,5);
		System.out.println(wt.toString());
		System.out.println(wr.toString());
		
		Train t = new Train(2,5,3,"Toronto","Montreal");
		Train y = new Train (7,8,10,"Bangcock","Dickland");
		Train s = new Train(t);
		System.out.println(t.toString());
		System.out.println(y.toString());
		System.out.println(s);
		
		Metro stm = new Metro(20,70,10,"Mtl","TOR",20);
		Metro stl = new Metro(30,50,20,"laval","Cv",40);
		Metro std = new Metro(stm);
		System.out.println(stm.toString());
		System.out.println(stl.toString());
		System.out.println(std);
		
		Tram t1= new Tram(10,20,30,"Snowden","Concordia",30,2000);
		Tram t2= new Tram(20,3,40,"Mcgill","hell",40,2060);
		Tram t3= new Tram(t1);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3);
		
		
		Monowheel m1= new Monowheel(69,30,100);
		Monowheel m2 = new Monowheel(20,30,50);
		Monowheel m3 = new Monowheel(m1);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3);
		
		Ferry F1 = new Ferry(30,69);
		Ferry F2 =new Ferry(89,40);
		Ferry F3 =new Ferry(F1);
		System.out.println(F1.toString());
		System.out.println(F2.toString());
		System.out.println(F3);
		
		
		Aircraft A1 = new Aircraft(999,1000);
		Aircraft A2 = new Aircraft(999,1000);
		Aircraft A3 = new Aircraft(A1);
		System.out.println(A1.toString());
		System.out.println(A2.toString());
		System.out.println(A3);
		
		
		WorldWar2Airplane W1 = new  WorldWar2Airplane(1,20,true);
		WorldWar2Airplane W2= new  WorldWar2Airplane(3000,4000,false);
		WorldWar2Airplane W3=new WorldWar2Airplane(W1);
		System.out.println(W1.toString());
		System.out.println(W2.toString());
		System.out.println(W3);
		
		
		System.out.println("the equality of two objects from different classes:"+W1.equals(A2));
		System.out.println("two objects from the same class with different values: "+W1.equals(W2));
		System.out.println("two objects with similar values: "+A1.equals(A2));
		
		
		Vehicle x [] = new Vehicle [15];
		x[0]=new WheeledTransportation(2,5);
		x[1]=new WheeledTransportation(3,5);
		x[2]=new Train(2,5,3,"Toronto","Montreal");
		x[3]=new Train (7,8,10,"Bangcock","Dickland");
		x[4]=new Metro(20,70,10,"Mtl","TOR",20);
		x[5]=new Metro(30,50,20,"laval","Cv",40);
		x[6]=new Tram(10,20,30,"Snowden","Concordia",30,2000);
		x[7]=new Tram(20,3,40,"Mcgill","hell",40,2060);
		x[8]=new Monowheel(69,30,100);
		x[9]=new Monowheel(20,30,50);
		x[10]=new Ferry(30,69);
		x[11]=new Ferry(89,40);
		x[12]=new Aircraft(999,1000);
		x[13]=new Aircraft(999,1000);
		x[14]=new  WorldWar2Airplane(1,20,true);
		
		findLeastAndMostExpensiveAircraft(x);
																				
		Vehicle z []= new Vehicle [16];
		z[0]=new WheeledTransportation(2,5);
		z[1]=new WheeledTransportation(2,5);
		z[2]=new Train(2,5,3,"Toronto","Montreal");
		z[3]=new Train (7,8,10,"Bangcock","Dickland");
		z[4]=new Metro(20,70,10,"Mtl","TOR",20);
		z[5]=new Metro(30,50,20,"laval","Cv",40);
		z[6]=new Tram(10,20,30,"Snowden","Concordia",30,2000);
		z[7]=new Tram(20,3,40,"Mcgill","hell",40,2060);
		z[8]=new Monowheel(69,30,100);
		z[9]=new Monowheel(20,30,50);
		z[10]=new Ferry(30,69);
		z[11]=new Ferry(89,40);
		z[12]=new Ferry(40,20);
		z[13]=new Ferry(50,30);
		z[14]=new Ferry(320,405);
		z[15]=new Ferry(420,514);
		
		findLeastAndMostExpensiveAircraft(z);

	}
	/**
	 * 
	 * @param x a vehicle object that is compared to see if it is an expensive or cheap aircraft
	 */
	public static void findLeastAndMostExpensiveAircraft(Vehicle [] x) {
		Aircraft [] planes = new Aircraft[2];
		for(int i = 0; i<x.length;i++) { 
			if(x[i] instanceof Aircraft) {
				if(planes[0]==null) {
					planes[0]=(Aircraft)x[i];
				}
				else if(planes[1]==null) {
					Aircraft z = (Aircraft)x[i];
					if(planes[0].getPrice()<z.getPrice()) {
						planes[1]=z;
					}
					else {
						planes[1]=planes[0];
						planes[0]=z;
					}
				}
				else {
					Aircraft y = (Aircraft)x[i];
					if(planes[0].getPrice() > y.getPrice()) {
						planes[0]=y;
					
					}
					else if(y.getPrice() >planes[1].getPrice()){
						planes[1]=y;
						
					}
				}
			}
		}
		
		if((planes[0]==null)&&(planes[1]==null)) {
			System.out.println("There is no planes.");
		}
		else if((planes[1]==null)) {
			System.out.println("The least and most expensive plane is"+planes[0]);
		}
		else {
			System.out.println("The least expensive plane is "+planes[0]+" and the most expensive plane is "+planes[1]);
		}
	}

}
