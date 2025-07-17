package whileexceptionhandling;

public class MultipleCatchExample {

    public static void main(String[] args) {
        try{
            int a=10,b=10,res=0;
            res=a/b;
            System.out.println("res is : "+res);

//compare this to cctv camra just the camra figureout object they immediate respond it '
            //null pointer exception
            String msg1="chandan";
            String msg2="null";
            System.out.println("msg1 length is "+ msg1.length());
            System.out.println(("msg2 length is "+msg2.length()));


            int arr[]={2,3,1,5};
            System.out.println("arr length is "+arr.length);
            System.out.println("arr index 7 is "+arr[7]);


        }
        catch(ArithmeticException e){
            System.out.println("exception occurred: "+e.getMessage()+"--------- "+e.getClass());
        }
        catch(NullPointerException e2){
            System.out.println("exception occured: "+ e2.getMessage()+"-----------"+e2.getClass());
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("exception occured: "+ e3.getMessage()+"-----------"+e3.getClass());

        }

        // instead of so many catchc blocks we can have only one generic cacth blcok

//        catch(Exception e){
//            System.out.println("exception occured: "+ e.getMessage()+"-----------"+e.getClass());
//
//        }
    }
}
