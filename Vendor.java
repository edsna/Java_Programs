/*Edson Zandamela
 * Seaside Stadium Vendor Drop
 * 
 * This program is designed to manage the information about the sales by the vendors who walk through the the streets selling snacks
 */

public class Vendor{
  
 private String Name;
 private int snackType;
 private double Price;
 private int InitialNUmSnacks;
 private int soldSnack;
 private double sales;
 private static int next;
 private static double [] Vendors = new double[3];

//CONSTRUCTOR
  public Vendor (String Na, int typsnck, double prc, int  ins){
  Name =Na;
  snackType = typsnck;
  Price = prc;
  InitialNUmSnacks = ins;
  }
  
  //sellSnack manages the units of snacks a vendor can and/sells
  public void sellSnack(int unitSold){
    if (unitSold<InitialNUmSnacks){
    InitialNUmSnacks = InitialNUmSnacks-unitSold;
    soldSnack = soldSnack + unitSold;
    Vendors[snackType-1]= Vendors[snackType-1]+(unitSold*Price);
    }
    else{
      System.out.println("Error!! You cannot sell more than you what you have!");
        };
  }
 //Refill method reflects the refill of nacks for each vendor
  public int refill(int refiller){
    InitialNUmSnacks = InitialNUmSnacks + refiller;
    return InitialNUmSnacks;
  }
// The method keeps track of a vendors' sales
  public double getSales(){
   // double sales;
    sales = soldSnack *Price;
    return sales;
  }
  //GetName manages the names of the vendors of each type of snacks
  public String getName(){
    return Name;
  }
  //GetType method determines the type of snacks each vendor is selling 
  public int getType(){
    return snackType;
  }


//Display All Totals method displays the total sales of all vendors for all snacks
 public void displaySnackTotals(int snackType){
   String typeOfSnack;
   if(snackType==1){
     typeOfSnack = "Popcorn";
     System.out.println(typeOfSnack + " sales are: $" + sales + Vendors[snackType-1]);
   }
   else if(snackType == 2){
       typeOfSnack = "Peanuts";
       System.out.println(typeOfSnack + " sales are: $"+ sales  + Vendors[snackType-1]);
 }
   else if(snackType==3){
     typeOfSnack = "Candy:";
   System.out.println(typeOfSnack + " sales are: $"+ sales  +  Vendors[snackType-1]); }
 }
 
//Display Snack method Totals displays the total combined sales of all vendors for that snack  
 public void displayAllTotals(){
  int a;
    for (a=0;a<Vendors.length;a++){
      System.out.println("Vendor sales are: " + (Vendors[a]));
      }
 }
//Display Vendor Data method displays all the information regarding a vendor and their product
  public void displayVendorData(){
    System.out.println("Name is: " + Name + " Snack Type is: " + snackType + soldSnack + " Total snacks sold are: " + soldSnack + " Sales are: $" + sales);
  }
  
  
}