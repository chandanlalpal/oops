package PolymorphismExample;

public class MainPolymorphismExample {

    public static void main(String[] args) {
        PerormSum perormSum=new PerormSum();
        perormSum.sum(12,23);
        perormSum.sum(3,4,5);
        perormSum.sum(23.88,45.33);
        perormSum.sum(1.23f,3.23f);
        perormSum.sum(3.44f,2);
    }
}
