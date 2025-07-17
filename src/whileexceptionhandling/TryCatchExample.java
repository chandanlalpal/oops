package whileexceptionhandling;

public class TryCatchExample {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;
        int res = 0;

        try {
            System.out.println("Inside try block excetpion occurs");
            res = a / b;
            System.out.println("Inside try block after exception occurs");

        } catch (Exception e) {
            System.out.println("Excetpion occured: " + e.getMessage()+"--------- "+e.getClass() );

        }
        System.out.println("a is: "+ a);
        System.out.println("b is : " +b);
        System.out.println(("res is: "+res));
    }
}
