package CoreJava;

import java.util.ArrayList;

public class Course {

    String courseName;
    String instructor;
    ArrayList<Student> enrolledStudents;
    int StudentId;

    public Course( String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<Student>();
        this.StudentId=StudentId;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
    public void removeStudent(int studentId) {
        enrolledStudents.remove(studentId);

   }
    public String getCourseDetails(){
        return (" courseName- "+courseName +" instructor- "+ instructor+"  enrolledStudents - "+enrolledStudents +" Student Id- "+StudentId);

    }
    public static void main(String[] args){
        Course course=new Course("Freshman","Professor");
        Student student1=new Student("101",45,50,15);
        Student student2=new Student("102",45,50,35);
        course.removeStudent(20);


        System.out.println(course.getCourseDetails());
    }
}


