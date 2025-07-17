package listexamples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stck1 = new Stack<>();

        // add data
        stck1.push(34);
        stck1.push(23);
        stck1.push(null);
        stck1.push(88);
        stck1.push(45);

        System.out.println("stck1 is : "+stck1);

        // remove data
        stck1.pop();
        stck1.pop();
        System.out.println("stck1 after 2 pops : "+stck1);


        // traverse
        System.out.println("traverse using foreach");
        for(Integer s1 : stck1){
            System.out.println(s1);
        }
    }
}