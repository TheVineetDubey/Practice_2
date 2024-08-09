package Pattern;

public class Test {
    public static void main(String[] args) {
        char s='a';
        int rows=5;
        int count =5;

        for(int i=0;i<rows;i++){

            for(int j=0;j<i ;j++){
              System.out.print(" ");
            }
            for (int k=0;k<count-i;k++){
              System.out.print(s + " ");
                s++;
            }
            System.out.println();
        }
    }
}
