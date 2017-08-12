//The program creates an array of all students in the course.

public class Course{
  private int size;
  private int nextspace=0;
  private Student[]studentList;
  
  public Course(int size){
    this.size=size;
    studentList=new Student[size];
  }
  
  public void addStudent(String name, int typeNum, int grade1, int grade2, int grade3){
    if (typeNum==1){
      studentList[nextspace]= new passFail(name);
      studentList[nextspace].setGrades(grade1, grade2, grade3);
      studentList[nextspace].calcFinalGrade();
      nextspace=nextspace+1;
    }
    else if (typeNum==2){
      studentList[nextspace]= new passFail(name);
      studentList[nextspace].setGrades(grade1, grade2, grade3);
      studentList[nextspace].calcFinalGrade();
      nextspace=nextspace+1;
    }
    else{
      System.out.println ("Error.");
    }
  }
  
  public void totalCourse(){
    for(int x=0; x<nextspace; x++){
      studentList[x].calcFinalGrade();
    }
  }
}