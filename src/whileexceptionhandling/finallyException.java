package whileexceptionhandling;

public class finallyException {

    public static void main(String[] args) {
        int a=10,b=0,res=0;

        try{
            System.out.println("inside try before excetpion occurs ");
            res=a/b;
            System.out.println("inside try after exception occurs");

        }
        catch(Exception e){
            System.out.println("excetpion occured : "+e.getMessage()+"--------"+e.getClass());
        }

        finally{
            System.out.println("a is : "+a);
            System.out.println("b is: "+b);
            System.out.println("res is: "+res);
            System.out.println(("finally block will always executes"));

            // try and catch
            //try and finally
            //try required a partner justl like finally or catch


        }
    }
}
