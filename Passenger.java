/*Edon Zandamela
*Off We Go Program
* This program is designed to manage passengers and their baggages as they fly through an Airline company
*
* The class passenger stores and manages all the information needed to represent a passenger on the plane.
*/
public abstract class Passenger{
  private String name;
  private String passStatus;
  private int numCheckedBags;
  private double checkedBagFee = 50.00; 
  private double maxBags =4; 
  
  
 //Constructor
  //The constructor bellow provides the values on it to passenger
  public Passenger (String na, String pssStt){
    name = na;
    passStatus = pssStt;
  }
  
//Methods
  //Add bags method controls the number of bags allowed in the flight
  public String addBags(int checkBags){
   String status = " Transaction was successfull! ";
   String status1 = " Baggage limit exceeded, transaction was not successfull! ";
  
    if (checkBags<=maxBags){
      numCheckedBags= numCheckedBags+checkBags;
      return(status);
    }
    else {
      return(status1);
    }
  }
  //getPassInfo method provides the name and status of the passenger 
  public String getPassInfo(){
    return("Passenger's name is: " + name + ";"+" Passenger's status is : " + passStatus);
  }
  //getnumCheckedBag method provides the number rof checked bags
  public int getnumCheckedBag (){
    return(numCheckedBags);
  }
  //getcheckedBagFee method provides the regular fee for a checked bag
  public double getcheckedBagFee(){
    //if (numCheckedBags == 0){
      //return(0.00);
   // }
    return(checkedBagFee);
  }
  //calcBagCost abstract method a manages the number of checked bags and baggage charge for each kind of passenger
  public abstract String calcBagCost();
}
  
