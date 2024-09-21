package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NthElement {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,5,6,7,8,9};
        int k=1;

        List<Integer> list=new ArrayList<>();

        for(int num:nums){
            list.add(num);
        }
        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list.get(k));
    }

}
