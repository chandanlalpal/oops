package setexamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();

        set1.add("Guava");
        set1.add("Mango");
        set1.add("Grapes");
        set1.add("Apple");
        set1.add("Banana");
        set1.add(null);
        set1.add("Guava");

        System.out.println("set1 is : "+set1);

        set1.remove("Grapes");
        System.out.println("set1 after removing one element: "+set1);

        System.out.println("traversing using foreach");
        for (String s1: set1){
            System.out.println(s1);
        }
    }
}