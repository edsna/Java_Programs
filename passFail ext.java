//This program extends the Student class to have a pass fail student.

public class passFail extends Student{
  
  public passFail(String name){
  super(name);
  }
  
  public void calcFinalGrade(){
    int totalGrade=getGradeTotal();
    System.out.print("Name: " +getName());
    showGrades();
    
    if (totalGrade>=60){
      System.out.println("You passed!");
    }
    else{
      System.out.println("You failed.");
    }
  }
}