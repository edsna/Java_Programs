import java.util.Scanner;

//Program to read and echo an integer from keyboard

public class SecondProgram{
  public static void main (String argv[]){
  
  int x;
  Scanner keyboard = new Scanner(System.in);
  
  //System.out.print("Enter an integer: ");
   // x= keyboard.nextInt();
  //System.out.println (x);
  
  
  //Edson Zandamela
  
  int low = 0;
  int high = 5;
  System.out.println("Enter an integer between " + low +" and " + high+ ": ");
    x= keyboard.nextInt();
  System.out.println (x);
  while (x<low||x>high){
    System.out.print("Enter an integer between 1 and 5: ");
    x= keyboard.nextInt();
  }
    System.out.println ("Your number " + x + " is in between " + low + "and " + high);
  }
}