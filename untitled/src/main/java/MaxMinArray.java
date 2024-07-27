public class MaxMinArray {
    public static void main(String[] args) {
        int a[]={10,2,5,6,99,9};

        int max=a[0];  // assume first vale as max
        int min=a[0];
        for (int i=1;i<a.length;i++)              //will start from index 1
        {
            if(a[i]> max)
            {
                max=a[i];
            }

        }
        System.out.println(max);
        for (int i=1;i<a.length;i++)              //will start from index 1
        {
            if(a[i]<min)
            {
                min=a[i];
            }

        }
        System.out.println(min);
    }

}
