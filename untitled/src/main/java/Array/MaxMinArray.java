package Array;

public class MaxMinArray {
    public static void main(String[] args) {
        int a[]={1,2,5,6,99,9};

        int max=a[0];  // assume first vale as max
        int min=a[0];
        for (int i=0;i<a.length;i++)              //will start from index 1
        {
            if(a[i]> max)
            {
                max=a[i];
            }
                     //will start from index 1
            else if(a[i]<min)
            {
                min=a[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }

}
