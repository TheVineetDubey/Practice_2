import java.util.ArrayList;
import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> set = new TreeSet<>();

        // Add elements
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One");  // Duplicate elements are not allowed

        // Access elements (TreeSet does not support random access)
        // Iterating through the set
        for (String element : set) {
            System.out.println("set "+element);
        }
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("One");  // Duplicate elements are allowed

        // Access elements by index
        System.out.println("Element at index 0: " + list.get(0));

        // Iterating through the list
        for (String element : list) {
            System.out.println("array "+ element);
        }
    }
}


