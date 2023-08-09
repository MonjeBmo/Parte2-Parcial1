package employed;

// Clase abstracta que representa a un empleado
public abstract class EmployedClass {

    // Atributos privados que encapsulan los datos del empleado
    private int id;
    private String name;
    private String lastname;
    private double salary;

    // Variable de clase para contar empleados (encapsulación y uso de variable de clase)
    public static int countEmployed;

    // Método abstracto para calcular el salario (abstracción)
    public abstract double calculateSalary();

    // Constructor de la clase que inicializa los atributos (encapsulación)
    public EmployedClass(int id, String name, String lastname, double salary) {
        // Incrementar el contador de empleados
        countEmployed += 1;
        
        // Inicializar los atributos
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    // Métodos getter y setter para acceder y modificar los atributos (encapsulación)
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
