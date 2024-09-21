package Collection;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String>hm= new HashMap<Integer,String>();

        //add pairs
        hm.put(101,"Java");
        hm.put(102,"Rum");
        hm.put(103,"Jaal");
        hm.put(104,"Run");

        System.out.println(hm);

        System.out.println("size of hashmap  "+hm.size());

        //remove one pair
        hm.remove(103);
        System.out.println("remove  "+hm);

        //acces value og the keu

        System.out.println(hm.get(102));

        //get all the keys from hashmap

        System.out.println(hm.keySet());

        System.out.println(hm.values());

        System.out.println(hm.entrySet());


    }

}

