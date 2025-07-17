package whileexceptionhandling;

import java.util.SortedMap;

public  class ThorwsExample {

    public static void demo() throws InterruptedException, IllegalAccessException {
        int a = 30;
        if (a == 10) {
            throw new ArithmeticException(("a is 10 and it is unchecked exception"));
        }
        if (a == 20) {
            throw new InterruptedException(("a is 30 and it is unchecked exception"));
        }


        if (a == 30) {
            throw new ArrayIndexOutOfBoundsException(("a is 10 and it is unchecked exception"));
        }
        if (a == 40) {
            throw new IllegalAccessException(("a is 30 and it is unchecked exception"));
        }
    }


    public static void main(String[] args) {
        try {
            ThorwsExample.demo();

        }
        catch(Exception e){
            System.out.println("exception occured: " + e.getMessage()+"---------"+e.getClass());
        }
    }
}
