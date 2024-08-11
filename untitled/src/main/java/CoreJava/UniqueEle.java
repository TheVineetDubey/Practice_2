package CoreJava;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class UniqueEle{
    public static void main(String[] args) {

        List<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        Set<Integer> unique=new HashSet<>(list);
        System.out.println(list);
        System.out.println(unique);



    }
}