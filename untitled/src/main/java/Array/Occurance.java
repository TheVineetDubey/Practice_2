package Array;

import java.util.HashMap;

public class Occurance {
        public static void main(String[] args) {
            // Step 1: Create an array with some numbers (like our colored balls)
            int[] array = {1, 2, 3, 4, 5, 5, 9, 9, 9, 2, 1};

            int[] countArray = new int[10];  // We use 5 because we have numbers 1 to 4

            // Step 3: Count each number using a simple for loop and if-else
            for (int i = 0; i < array.length; i++) {
                int num = array[i];
                if (num >= 1 && num <= 9) {
                    countArray[num]++;
                }
            }



            // Step 4: Print out the counts of each number
            for (int i = 1; i < countArray.length; i++) {
                if (countArray[i] > 0) {
                    System.out.println(i + " occurs " + countArray[i] + " times");
                }
            }
        }
}


