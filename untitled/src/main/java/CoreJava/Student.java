package CoreJava;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private int age;
    private String name;
    private String gradelevel;
    private ArrayList<Integer>grades;

    public Student(int studentId, int age, String name, String gradelevel) {
        this.studentId = studentId;
        this.age = age;
        this.name = name;
        this.gradelevel = gradelevel;
        this.grades = new ArrayList<>();
    }

  public void addGrade(int grade){
        grades.add(grade);
    }
    public double calculateAverage() {
        int i = 0;
        int sum = 0;



       while(i<grades.size()){
           sum=sum+grades.get(i);
           i++;
       }
       return (double) sum/grades.size();
    }
    public String getDetails(){
       return ("student id "+studentId+"  age "+age+"  name "+ name+"  gradelevel "+gradelevel+"  grades  "+grades+"  Average "+calculateAverage());

    }

    public static void main(String[] args){
       Student student=new Student(007,36,"Rio","Freshman");
       student.addGrade(85);
       student.addGrade(20);
       student.addGrade(75);

        System.out.println(student.getDetails());
    }
}



