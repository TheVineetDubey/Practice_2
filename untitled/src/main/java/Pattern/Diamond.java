package Pattern;

public class Diamond {
    public static void main(String[] args) {
        int row=4;

        for (int i=1;i<=row;i++){
            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=row-1;i>=1;i--){
            for (int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
