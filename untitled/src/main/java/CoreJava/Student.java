package CoreJava;

public class Student {
        String name;
        int marks1;
        int marks2;
        int marks3;

        public Student(String name,int marks1,int marks2,int marks3){
            this.name=name;
            this.marks1=marks1;
            this.marks2=marks2;
            this.marks3=marks3;
        }
        public int total(){
            return marks1+marks2+marks3;
        }
        public double percent(){
            return (total()/3.0);
        }

        public String grade(){
            double percentage=percent();
            if(percentage>90) {
                return "A+";
            }
            if(percentage>80) {
                return "A";
            }
            if(percentage>70) {
                return "B+";
            }
            if(percentage>60) {
                return "B";
            }
            if(percentage>50) {
                return "C";
            }
            else {
                return "D";
            }
        }
    public void details(){
            System.out.println("Name "+ name);
            System.out.println("Subject 1:: "+marks1);
            System.out.println("Subject 2:: "+marks2);
            System.out.println("Subject 3:: "+marks3);
            System.out.println("total:: "+total());
            System.out.println("Percentage:: "+percent()+"%");
            System.out.println("Grade:: "+grade() );
        }

    public static void main(String[] args) {
<<<<<<< HEAD
        Student student = new Student("Vineet", 85, 90, 88);
=======
        Student student = new Student("John Doe", 85, 90, 88);
>>>>>>> origin/main
        student.details();
    }
}
