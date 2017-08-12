//Yesenia Garcia and Edson Zandamela
//Lab Bugs
//Class will create a new bug. Methods will hit bugs. If energy level is less than 0, the bug is dead and bug alive count should update accordingly.
public class Bug{
  //instance variables
  private String name;
  private int energylevel;
  public int shoe = 5;
  public int newspaper = 3;
  public static int numalive;
  
  //constructors
  public Bug(String fname, int fenergy){
    name = fname;
    energylevel= fenergy;
  }
  public Bug(String ffname){
    name = ffname;
    energylevel = 10;
  }
  
  //methods
  public void hit(int type){
    if ((type == 1) && (energylevel>0)){
      energylevel= energylevel-shoe;
    } 
    else if ((type== 2) && (energylevel>0)){
      energylevel= energylevel-newspaper;
    }
    else{
      System.out.println("Invalid hit type or bug already dead.");
    }
    }
  //print statement- status of bugs
  public void showStatus(){
    System.out.println("Bug's name is: " + name);
    System.out.println("Current energy level is: " + energylevel);
    
    boolean status= isAlive();
    if (status == true){
      System.out.println("Status: Alive");
    }
    else if (status== false){
      System.out.println("Status: Dead");
    }}
  
  private boolean isAlive(){
    if (energylevel<= 0){
      return false;
    }
    else {
      numalive= numalive+1;
      return true;
    }
  }
  //print statement- bug alive count
  public void aliveCount(){
    System.out.println("Bugs alive are: " + numalive);
  }
    
}