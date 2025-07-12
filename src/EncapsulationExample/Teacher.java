package EncapsulationExample;

public class Teacher {

    private int id;
    private String name;
    private String qualification;
    private double salary;
    private String email;


    //getter - used to fetch/get data
    //setter- used to assign / set the value


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
