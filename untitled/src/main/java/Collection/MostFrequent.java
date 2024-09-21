package Collection;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static void main(String[] args) {
        int [] arr={1,1,1,1,1,2,22,2,2,3};

        Map<Integer,Integer> map=new HashMap<>();

        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int mostFreq=arr[0];
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>map.get(mostFreq)){
                mostFreq=entry.getKey();
            }
        }
        System.out.println(mostFreq);
    }
}
