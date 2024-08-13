package CoreJava;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private ArrayList<Course> coursesOffered;

    public  School(String name) {
        this.schoolName = schoolName;
        this.coursesOffered = new ArrayList<>();
    }

    public void addCourse(Course course){
        coursesOffered.add(course);
    }
    public void removeCourse(String courseName) {

        coursesOffered.remove(courseName);
    }


    public String displayAllCourses(){
        return ("Course "+ coursesOffered);

    }

    public static void main(String[] args){
       School school =new School("UPTU");

       Course mechanical= new Course("Mechanical","Prof X");
        Course civil= new Course("civil","Prof X");
        school.addCourse(mechanical);
        school.addCourse(civil);
        school.removeCourse("Civil");

        System.out.println(school.displayAllCourses());
    }
}

