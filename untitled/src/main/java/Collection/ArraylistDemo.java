package Collection;

import java.util.ArrayList;

public class ArraylistDemo {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        // ArrayList <Integer> myList = new ArrayList<Integer>();

        //Adding
        myList.add(100);
        myList.add(10);
        myList.add(11);
        myList.add(100);
        myList.add("Welcome");
        myList.add(10);
        myList.add(1);

        //size
        System.out.println(myList.size());

        //list
        System.out.println("list  "+myList);

        //remove
        myList.remove(4);
        System.out.println("remove  "+myList);

        //add
        myList.add(4,"Bye");
        System.out.println("add   "+myList);

        //replace
        myList.set(4,"good");
        System.out.println("replacement   "+myList);

        //specific value

        System.out.println("specific value  "+myList.get(4));

        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }








    }
}
