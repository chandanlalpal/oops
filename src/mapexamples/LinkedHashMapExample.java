
package mapexamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new LinkedHashMap<>();

        map1.put(105,"Grapes");
        map1.put(107,"Guava");
        map1.put(103,"Apple");
        map1.put(101,"Pomegranate");
        map1.put(109,"Banana");
        map1.put(110,"Apple");
        map1.put(104,"Grapes");
        map1.put(111,null);
        map1.put(108,null);
        map1.put(104,"Watermelon");// watermelon overrides grapes
        map1.put(110,"Pineapple"); // pineapple overrides apple
        map1.put(null,"Cherry");

        System.out.println("map1 is : "+map1);

        map1.remove(111);
        System.out.println("map1 after removing 111 key :"+map1);

        System.out.println("traversing map1 ");
        for(Map.Entry m1:map1.entrySet()){
            System.out.println(m1.getKey()+"----"+m1.getValue());
        }
    }
}
