package classandobjects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Student student1 = new Student();//create a object of student class

       // System.out.println("student1 object before assigning values : "+student1);//print default values

        // assigning the values to the object
        student1.id = 123;
        student1.name ="Ajay";
        student1.email ="ajay123@gmail.com";
        student1.grade="5th grade";
        student1.dob="12/12/2014";

        System.out.println("student1 object after assigning values : "+student1);

        student1.name ="Suraj";// change the value
        System.out.println("student1 object after changing name value : "+student1);

        int abc=100;
        final int xyz=400;// example of final keyword
        System.out.println("abc is : "+abc+" --------- xyz is : "+xyz);

        abc=500;
        //xyz=700; - since xyz is final we cannot change it
        System.out.println("abc after change is : "+abc+" --------- xyz is : "+xyz);


        Demo demo = new Demo();//create a object of demo class
        System.out.println("abc is : "+demo.abc);
        System.out.println("mno is : "+Demo.mno);// not create a object only access name the class

        demo.demo1();
        Demo.demo2();

    }
}
