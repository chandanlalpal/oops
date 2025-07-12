package PolymorphismExample;

public class PerormSum {

    public void sum(int a,int b){
        System.out.println("sum of two int nos is : "+(a+b));
    }

    public void sum(int a,int b,int c){
        System.out.println("sum of two int nos is : "+(a+b+c));
    }

    public void sum(float a,float b){
        System.out.println("sum of two int nos is : "+(a+b));
    }

    public void sum(double a,double b){
        System.out.println("sum of two int nos is : "+(a+b));
    }

    public void sum(float a,int b){
        System.out.println("sum of two int nos is : "+(a+b));
    }

    public void sum(float a,double b){
        System.out.println("sum of two int nos is : "+(a+b));
    }

//    public void sum(double a,float b){
//        System.out.println("sum of two int nos is : "+(a+b));
//    }
}
