package CoreJava;

import javafx.scene.effect.SepiaTone;

import java.util.*;

public class Fruits {
    public static void main(String[] args) {

        String[] arr={"Banana","Apple","Orange","Mango","Grapes"};
        List<String> list = Arrays.asList(arr);

        Set<String> sorted= new TreeSet<>(list);

        System.out.println(list);
    }
}