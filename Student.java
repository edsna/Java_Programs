//Student Grade Lab
//Dana Podlucky
//This program calculates the final grades for 2 different types of students, and then makes a list of all students in the course in a different class defintion.

public abstract class Student{
  private String name;
  private int [] grades=new int[3];
  public Student(String n){
    name=n;
  }
  public abstract void calcFinalGrade();
  public void setGrades(int grade1, int grade2, int grade3){
    grades[0]=grade1;
    grades[1]=grade2;
    grades[2]=grade3;
  }
  public int getGradeTotal(){
      return grades[0]+grades[1]+grades[2];
  }
  public String getName(){
    return name;
  }
  public void showGrades(){
    int lengthGrades=grades.length;
      for (int x=1;x<=lengthGrades;x++){
        System.out.println(" Grade "+(x)+ ": "+grades[x-1]);
      }
  }
}

