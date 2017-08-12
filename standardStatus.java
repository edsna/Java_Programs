/*Edon Zandamela
*Off We Go Program
* This program is designed to manage passengers and their baggages as they fly through an Airline company
*
* standardStatus class determines the total cost of checked bags for a standard passenger.
*/

public class standardStatus extends Passenger{

//Constructor
  //assigns or provodes the values on it to the class premier
  public standardStatus(String na){
    super(na, " Standard passenger ");
  }
 //Method
  //calBagCost determines the cost of the standard passenger checked baggage
  public String calcBagCost(){        
    return(" Checked bags: " + getnumCheckedBag() + " Baggage charge is: $ " + getnumCheckedBag()*getcheckedBagFee()+"0");
           }
  }
