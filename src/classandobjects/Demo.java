package classandobjects;
class Demo{

public int abc = 700; // non-static variables - object is required
public static int mno =900; // static variable

public void demo1(){
    System.out.println("demo1 non-static method"); // - object is required
}

public static void demo2(){
    System.out.println("demo2 static method");
}
}
