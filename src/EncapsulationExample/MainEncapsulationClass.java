package EncapsulationExample;

public class MainEncapsulationClass {
    public static void main(String[] args) {


        Teacher teacher = new Teacher();
        teacher.setName("Chandan");
        teacher.setId(234);
        teacher.setQualification("MCA");
        teacher.setSalary(50000.00);
        teacher.setEmail("cpal87436@gmail.com");
        System.out.println("teacher is: "+ teacher);

        // you also pirnt the value separatly


        System.out.println("teacher name is: "+ teacher.getName());
        System.out.println("teacher qualification is: "+teacher.getQualification());

    }
}
