package employed;

public abstract class EmployedClass {

    private int id;
    private String name;
    private String lastname;
    private double salary;

    public int countEmployed;

    public abstract double calculateSalary();

    public EmployedClass(int id, String name, String lastname, double salary) {
        countEmployed += 1;
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    

}
