package Pattern;

public class RightANgle {
    public static void main(String[] args) {
        char c='a';
        int rows=5;

        for (int i=1;i<=rows;i++){  //outer for loop for rows
            for (int j=1;j<=i;j++){     //inner for loops for columns
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
