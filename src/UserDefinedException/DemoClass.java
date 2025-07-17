package UserDefinedException;

public class DemoClass {
    public static void main(String[] args) {
        try{
            String user=null;
            if(user==null){
                throw new UserNotFoundException(("sorry! user not found)"));

            }
        }
        catch(Exception e){
            System.out.println("Exception occurred: "+ e.getMessage()+"--------"+e.getClass());
        }
    }
}
