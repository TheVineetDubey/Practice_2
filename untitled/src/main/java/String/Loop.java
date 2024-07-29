package String;

public class Loop {
    public static void main(String[] args) {
        int row, numberOfStars;

        for (row = 1; row <= 5; row++) {
            for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println(); // Go to next line
        }
            //print row for                print number of starts for
                    //1                     1
                    //12                    22
                    //123                   333
                   // 1234                  4444

    }
}
