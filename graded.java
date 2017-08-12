//This program extends student to create a graded student.

public class graded extends Student{
  public graded(String name){
    super(name);
  }
  
  public void calcFinalGrade(){
     int totalGrade=getGradeTotal();
     System.out.print("Name: " +getName());
     showGrades();
     if (totalGrade>=85){
       System.out.println("Final Grade: A");
     }
     else if (totalGrade>=74){
       System.out.println("Final Grade: B");
     }
     else{
       System.out.println("Final Grade: C");
     }
  }
}