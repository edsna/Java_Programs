/*Edson Zandamela
 * Seaside Stadium Vendor Drop
 * 
 * This program is designed to manage the information about the sales by the vendors who walk through the the streets selling snacks
 */
//The main prints all the information about the management of vendors int he array
public class vendortest{
   public static void main(String agrv[]){
     Vendor vendor0 = new Vendor("Edson", 1, 2.00 , 10);
     Vendor vendor1 = new Vendor("Elton", 2, 3.00 , 10);
     Vendor vendor2 = new Vendor("Edna", 3, 3.00, 10);
     Vendor vendor3 = new Vendor("Edon", 3, 4.00, 10);
     Vendor vendor4 = new Vendor("Edmilson", 2, 2.00, 10);
     Vendor vendor5 = new Vendor("Edsn", 1, 2.00, 10);
     
System.out.println("___________________");

     vendor0.sellSnack(8);
     vendor1.sellSnack(9);
     vendor2.sellSnack(6);
     vendor3.sellSnack(7);
     vendor4.sellSnack(8);
     vendor5.sellSnack(8);
     
System.out.println("___________________");

     vendor0.getSales();  
     vendor1.getSales(); 
     vendor2.getSales(); 
     vendor3.getSales(); 
     vendor4.getSales(); 
     vendor5.getSales(); 
     
System.out.println("___________________");

     vendor0.getName();  
     vendor1.getName(); 
     vendor2.getName(); 
     vendor3.getName(); 
     vendor4.getName(); 
     vendor5.getName();
      
System.out.println("___________________");
     
     vendor0.getType();  
     vendor1.getType(); 
     vendor2.getType(); 
     vendor3.getType(); 
     vendor4.getType(); 
     vendor5.getType();
  
System.out.println("___________________");
     
     vendor0.displaySnackTotals(1);  
     vendor1.displaySnackTotals(2); 
     vendor2.displaySnackTotals(3); 
     vendor3.displaySnackTotals(3); 
     vendor4.displaySnackTotals(2); 
     vendor5.displaySnackTotals(1);
     
System.out.println("________________");     
     
     vendor0.displayVendorData();  
     vendor1.displayVendorData(); 
     vendor2.displayVendorData(); 
     vendor3.displayVendorData(); 
     vendor4.displayVendorData(); 
     vendor5.displayVendorData();
     
System.out.println("___________________");     
     
     vendor0.displayAllTotals();  
      
System.out.println("___________________"); 
    
     vendor0.refill(3);
     vendor1.refill(2);
     vendor2.refill(2);
     vendor3.refill(2);
     vendor4.refill(2);
     vendor5.refill(2);
    
     vendor1.displayAllTotals();
System.out.println("___________________");   

    SectionSales section0, section1, section2, section3;
    section0 = new SectionSales("Etelvina", 3);
    section1 = new SectionSales("Etelvino" , 3);
    section2 = new SectionSales("Edneusa", 3);
    section3 = new SectionSales("Edy", 3);
   
    section0.addVendor("Edson", 1, 2.00 , 10);
    section1.addVendor("Elton", 2, 3.00 , 10);
    section2.addVendor("Edna", 3, 3.00, 10);
    section3.addVendor("Edon", 3, 4.00, 10);
    section1.addVendor("Edmilson", 2, 2.00, 10);
    section2.addVendor("Edsn", 1, 2.00, 10);
   
    
    
    section0.displaySectionVendorData();
    section1.displaySectionVendorData();
    section2.displaySectionVendorData();
    section3.displaySectionVendorData();
System.out.println("___________________");     
    section0.displaySectionAllTotals();
    section1.displaySectionAllTotals();
    section2.displaySectionAllTotals();
    section3.displaySectionAllTotals();
    System.out.println("___________________");   
      section0.vendorSale("Edson", 4);
      section1.vendorSale("Elton", 9);
      section2.vendorSale("Edna",3);
      section3.vendorSale("Edon" ,5);
      section2.vendorSale("Edmilson", 9);
      section1.vendorSale("Edsn",2);
      
      section0.vendorRefill("Edson", 3);
      section1.vendorRefill("Elton", 3);
      section2.vendorRefill("Edna",3);
      section3.vendorRefill("Edon" ,3);
      section2.vendorRefill("Edmilson", 3);
      section1.vendorRefill("Dana",3);
      section1.vendorRefill("Diana",3);
     
    section0.displaySectionSnackVendors(1);
    section1.displaySectionSnackVendors(1);
    section2.displaySectionSnackVendors(1);
    section3.displaySectionSnackVendors(1);
    
System.out.println("___________________");   

      section1.displayAllSectionSnackTotals(2);
     section1.displayAllSectionSnackTotals(3);
     section1.displayAllSectionSnackTotals(1);
    
   }
}