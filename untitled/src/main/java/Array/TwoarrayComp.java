package Array;

import java.util.Arrays;

public class TwoarrayComp {
    public static void main(String[] args) {
        int a1[]={1,2,4,5,7,8};
        int a2[]={1,2,4,5,7,9};
//app-1
        //boolean status=Arrays.equals(a1,a2);

        //if (status==true)
        //{
       //     System.out.println("equal");
        //}
        //else
        //{
        //    System.out.println("not eq");
        //}
//app-2
        boolean status=true;

        if (a1.length==a2.length)
        {
            for(int i=0;i<a1.length;i++)
            {
               if(a1[i]!=a2[i])
               {
                   status = false;
               }
            }

        }
        else
        {
            status=false;
        }

        if (status==true)
        {
            System.out.println("array eq");
        }
        else
        {
            System.out.println("not eq");
        }




    }

}
