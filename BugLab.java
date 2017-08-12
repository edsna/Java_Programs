//Yesenia Garcia and Edson Zandamela
//Lab Bugs
//create array of 3 bugs and printing their status along with bug alive count

public class Bugtest{
  
  public static void main (String argv[]){
    Bug [] allbugs;
    allbugs = new Bug [3];
    allbugs[0]= new Bug("KitKat");
    allbugs[1]= new Bug("Gus");
    allbugs[2]= new Bug("Horse", 15);
    allbugs[0].hit(1);
    allbugs[1].hit(2);
    allbugs[1].hit(1);
    allbugs[1].hit(2);
    allbugs[2].hit(0);
    allbugs[2].hit(1);
    
    for (int i=0; i< allbugs.length; i++){
      allbugs[i].showStatus();
      allbugs[i].aliveCount();
    }}}