/*Edon Zandamela
*Off We Go Program
* This program is designed to manage passengers and their baggages as they fly through an Airline company
*
* PremierStatus class determines the total cost of checked bags for a premier passenger.
*/
public class premierStatus extends Passenger{
  private final int discount = 2;
  
 //Constructor
  //assigns or provodes the values on it to the class premier
  public premierStatus(String na){
    super(na, " Premier passenger ");
  }
//Method
  //calBagCost determines the cost of the premier passenger checked baggage
  public String calcBagCost(){
    
    String test2;
    double test = getnumCheckedBag();
    
    if (test==0 || test<=2){
       test2 = " Checked bags: " + getnumCheckedBag() + " Baggage charge is: $ 0.00 ";
       return(test2);
    }
    else {
        test2 = " Checked bags: " + getnumCheckedBag() + " Baggage charge is: " + (getnumCheckedBag()-discount)*getcheckedBagFee();
        return(test2);
    }
   
} 
}

