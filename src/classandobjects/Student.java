package classandobjects;

public class Student {

    public int id;
    //541646git
    public String name;
    public String dob;
    public String grade;
    public String email;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // it converts object into string format and print in console output

}
