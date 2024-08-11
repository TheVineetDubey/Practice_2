package CoreJava;

public class Students10 {

    // Define a Student class with name and marks
        static class Student {
            String name;
            int marks;

            Student(String name, int marks) {
                this.name = name;
                this.marks = marks;
            }
        }

        public static void main(String[] args) {
            // Array of Student objects
            Student[] students = {
                    new Student("Alice", 85),
                    new Student("Bob", 70),
                    new Student("Charlie", 90),
                    new Student("David", 60),
                    new Student("Eve", 75),
                    new Student("Frank", 95),
                    new Student("Grace", 80),
                    new Student("Hannah", 85),
                    new Student("Ivy", 70),
                    new Student("Jack", 65)
            };

            // Call the sort function
            bubbleSort(students);

            // Print sorted students
            System.out.println("Sorted students by marks:");
            for (Student student : students) {
                System.out.println(student.name + ": " + student.marks);
            }
        }

        // Bubble Sort function for Student objects
        public static void bubbleSort(Student[] array) {
            int n = array.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j].marks > array[j + 1].marks) {
                        // Swap the Student objects
                        Student temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                // If no two elements were swapped in the inner loop, then break
                if (!swapped) break;
            }
        }
    }


