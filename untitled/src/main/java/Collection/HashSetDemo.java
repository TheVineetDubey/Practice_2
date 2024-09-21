package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet myset=new HashSet();
        //Hashset <String> myset=new HashSet<String>();

        myset.add(100);
        myset.add("Bye");
        myset.add(1);
        myset.add(10);
        myset.add(100);
        myset.add("Byebye");
        myset.add(11);
        myset.add(101);

        System.out.println(myset);

        //Remove ele  index is not supported
        myset.remove(11);
        System.out.println(myset);

        //inseting element not possible
        //access specififc element not possible

        //convert hashset int to arraylist

        ArrayList al= new ArrayList(myset);

        System.out.println(al);
        System.out.println(al.get(2));


    }
    }

