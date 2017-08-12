/*Edon Zandamela
*Off We Go Program
* This program is designed to manage passengers and their baggages as they fly through an Airline company
*
* checkInClass class displays the passenger's name, status, number of bags and baggage charge.
*/
public class checkInClass{
  
  //THE METHOD
  public void printCheckedBagReceipt(Passenger p){
    System.out.println(p.getPassInfo());
    System.out.println(p.calcBagCost());
  }
}