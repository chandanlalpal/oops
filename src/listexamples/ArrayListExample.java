package listexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // wrapper class examples
//        int a=10; // a is stored as variable inside memory
//        a=null;
//
//        Integer b=90; // b is stored as object inside memory
//        b=null;

        // declaring the list
        List<Integer> list1 = new ArrayList<>();

        // adding data
        list1.add(23);
        list1.add(12);
        list1.add(56);
        list1.add(90);
        list1.add(24);
        list1.add(12);
        list1.add(23);
        // list1.add(null);
        list1.add(12);
        // list1.add(null);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(4);
        list1.remove(6);

        System.out.println("list1 after removing 4th and 6th index element : "+list1);

        // search list
        System.out.println("3rd index element in list1 is : "+list1.get(3));
        System.out.println("5th index element in list1 is : "+list1.get(5));

        // size
        System.out.println("size if list1 is : "+list1.size());

        // sort
        Collections.sort(list1);
        System.out.println("list1 after sorting : "+list1);

        // traversing the list
        System.out.println("traversing using foreach");
        for(Integer l1 : list1){
            System.out.println(l1);
        }

    }
}