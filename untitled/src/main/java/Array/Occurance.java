package Array;

public class Occurance {
        public static void main(String[] args) {

            int[] array = {1, 2, 3, 4, 5, 5, 9, 9, 9, 2, 1};

            int[] countArray = new int[10];


            for (int i = 0; i < array.length; i++) {
                int num = array[i];
                if (num >= 1 && num <= 9) {
                    countArray[num]++;
                }
            }

            for (int i = 0; i < countArray.length; i++) {
                if (countArray[i] > 0) {
                    System.out.println(i + " occurs " + countArray[i] + " times");
                }
            }
        }
}


