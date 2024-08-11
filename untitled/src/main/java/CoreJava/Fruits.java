package CoreJava;

<<<<<<< HEAD
import javafx.scene.effect.SepiaTone;

import java.util.*;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> origin/main

public class Fruits {
    public static void main(String[] args) {

<<<<<<< HEAD
        String[] arr={"Banana","Apple","Orange","Mango","Grapes"};
        List<String> list = Arrays.asList(arr);

        Set<String> sorted= new TreeSet<>(list);
=======
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");
>>>>>>> origin/main

        System.out.println(list);
    }
}