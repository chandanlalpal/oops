package whileexceptionhandling;

import java.util.concurrent.CompletionException;

public class ThrowExample {
    public static void main(String[] args) {

// you manually throw the exception
        try {
            int a = 20;
            if (a == 10) {
                System.out.println("a is: " + a);
            }
            if (a == 20) {
                throw new Exception("a is 20 hence manually throwing the exception");
            }
        } catch (Exception e) {
            System.out.println("exception occured : " + e.getMessage() + "---------" + e.getClass());
        }
    }
}
