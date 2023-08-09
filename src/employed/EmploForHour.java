package employed;

/*
 * 
 * EmpleadoPorHoras: Una subclase de Empleado que representa a los empleados que son
 * pagados por horas trabajadas. Debe tener un atributo para almacenar el número de horas
 * trabajadas y un método para calcular el salario total considerando una tarifa por hora
 * 
 */

// Clase EmpleadoPorHoras que hereda de la clase Empleado
public class EmploForHour extends EmployedClass {

    // Atributos específicos de la clase EmpleadoPorHoras
    private int cantHours; // Número de horas trabajadas
    private double tarifa; // Tarifa por hora

    // Implementación del método abstracto calculateSalary() de la clase padre
    @Override
    public double calculateSalary() {
        // Cálculo del salario multiplicando la tarifa por las horas trabajadas
        super.setSalary(this.tarifa * this.cantHours); // Se actualiza el salario en la clase padre
        return super.getSalary();
    }

    // Constructor de la clase EmpleadoPorHoras
    public EmploForHour(int id, String name, String lastname, double salary, int cantHours, double tarifa) {
        // Llamada al constructor de la clase padre para inicializar atributos comunes
        super(id, name, lastname, salary);

        // Inicialización de atributos específicos de la clase EmpleadoPorHoras
        this.cantHours = cantHours;
        this.tarifa = tarifa;
    }

    // Métodos getter y setter para los atributos específicos
    public int getCantHours() {
        return cantHours;
    }

    public void setCantHours(int cantHours) {
        this.cantHours = cantHours;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
