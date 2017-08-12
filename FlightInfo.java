/*Edon Zandamela
*Off We Go Program
* This program is designed to manage passengers and their baggages as they fly through an Airline company
*
* FlightInfo class contains the main of the whole program and calls all the methods needed to run the program..
*/

public class FlightInfo{
  
  public static void main(String argv[]){
    //SOUNDS LIKE I NEED TO HAVE A PREMIER STATUS OBJECT HERE
    premierStatus test = new premierStatus("Sue Smith");
    checkInClass c = new checkInClass();
    System.out.println(test.addBags(4));
    c.printCheckedBagReceipt(test);
    
    standardStatus  test1 = new standardStatus("Sally Summers");
    checkInClass e = new checkInClass();
    System.out.println(test1.addBags(3));
    c.printCheckedBagReceipt(test1);
    
    premierStatus test3 = new premierStatus("Tom Traveler");
    checkInClass f = new checkInClass();
    System.out.println(test3.addBags(5));
    c.printCheckedBagReceipt(test3);
  } 
}
