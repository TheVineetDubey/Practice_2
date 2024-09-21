package Collection;

import java.util.*;

public class RemoveDUplicate {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(11,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,11,2,2);

        Set<Integer> set=new HashSet<>(list);

        List<Integer>unique=new ArrayList<>(set);

        System.out.println(unique);


    }
}
