package Pattern;

public class Rectangle {
    public static void main(String[] args) {
        int rows=6;
        for (int i=1;i<=rows;i++){  //outer for loop for rows
            for (int j=1;j<=rows;j++){     //inner for loops for columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


