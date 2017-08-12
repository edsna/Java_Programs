/*Edson Zandamela
 * Seaside Stadium Vendor Drop
 * 
 * This program is designed to manage the information about the sales by the vendors who walk through the the streets selling snacks
 */

//This class manages the information for all vendors in a particular section and maintains the array with vendors
public class SectionSales{
  private Vendor [] listVendors;
  private int next;
  private String sectionName;
  private String Name;
  private int typeSnack;
  private int soldSnack;
  private double getSales;
  private int Refiller;
  
   //COnstructor
  public SectionSales(String sectionName, int maxVendors){
   sectionName = sectionName;
    listVendors = new Vendor[maxVendors]; 
  }
  
  //Methods
  //This method manages the process of adding vendors onto the array
  public void addVendor(String Name, int typeSnack, double Price, int InitialNUmSnacks){
    if (next<=listVendors.length){
  
    listVendors[next] = new Vendor( Name, typeSnack, Price, InitialNUmSnacks);
    next++;
               }
    else{
      System.out.println("Error!! You cannot add more vendors!");
    }
  }
  
  
//This class tracks the amount of vendors per type of snack
    public  void vendorSale(String Name, int soldSnack){
    
  boolean found = false;
  for(int k=0;k<next;k++){
    if ((Name.equals(listVendors[k].getName()))==true){
        listVendors[k].getSales();
        found = true;
      }
  }
      if(found == false){
        System.out.println("Error!! Vendor name is not in the list of vendors!");
      }
      }

    
// this method manges the amount of refill given to each vendor at a time
public void vendorRefill(String Name, int refiller){
  int l;
  boolean found = false;
  for(l=0;l<next;l++){
    if ((Name.equals(listVendors[l].getName()))==true){
        listVendors[l].refill(refiller);
        found = true;
      }
  }
      if( found == false){
        System.out.println("Error!! Vendor name is not in the list of vendors");
      }
      }
    
    //Disply Section Vendor Data Manages the vendor data per section in the array
    public void displaySectionVendorData(){
   
    for (int i=0; i<next; i++){
   listVendors[i].displayVendorData();
  }
  }
 //The next method determines the total for each individual vendor in the array
  public void displaySectionAllTotals(){
   System.out.println("Section name is: " + sectionName);
   
   for (int j=0; j<next; j++){
      listVendors[j].displaySnackTotals(listVendors[j].getType());
  }
  }

//  The method bellow displays the data regarding each type of vendor in the array
  public void displaySectionSnackVendors(int typeSnack){
    System.out.println("Section name is: " + sectionName);
   for (int i=0;i<next;i++){
     if (listVendors[i].getType() == typeSnack){
     listVendors[i].displayVendorData();
     }}}
  //
  public void displayAllSectionSnackTotals(int typeSnack){
    listVendors[0].displaySnackTotals(typeSnack);
  }
 }