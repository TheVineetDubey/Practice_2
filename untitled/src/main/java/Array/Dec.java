package Array;

public class Dec {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 9, 9, 9, 2, 1};
        int len = arr.length;
        int check = 1;
        int count=0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                //if(arr[i]==arr[j]){
                //}
                if(arr[i]==check)
                {
                    count++;
                    break;
                }
                else
                {
                    break;
                }


            }
        }
        System.out.println("repition " + count);
    }
}
