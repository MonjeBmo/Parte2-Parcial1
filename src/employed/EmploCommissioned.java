package employed;

/*
 *
 *  EmpleadoPorComision: Una tercera subclase de Empleado que representa a los empleados
 *  que reciben una comisión por ventas realizadas. Debe tener atributos para almacenar el 
 *  monto total de ventas y la tasa de comisión. Debe tener un método para calcular el salario total.
 * 
 */

// Clase EmpleadoPorComision que hereda de la clase Empleado
public class EmploCommissioned extends EmployedClass {

    // Atributos específicos de la clase EmpleadoPorComision
    private double cantSales; // Monto total de ventas
    private double comision; // Tasa de comisión

    // Constructor de la clase EmpleadoPorComision
    public EmploCommissioned(int id, String name, String lastname, double salary, double cantSales, double comision) {
        // Llamada al constructor de la clase padre para inicializar atributos comunes
        super(id, name, lastname, salary);

        // Inicialización de atributos específicos de la clase EmpleadoPorComision
        this.cantSales = cantSales;
        this.comision = comision;
    }

    // Implementación del método abstracto calculateSalary() de la clase padre
    @Override
    public double calculateSalary() {
        // Cálculo del salario sumando el salario base y la comisión por ventas
        return (super.getSalary() + (this.cantSales * comision));
    }

    // Métodos getter y setter para los atributos específicos
    public double getCantSales() {
        return cantSales;
    }

    public void setCantSales(double cantSales) {
        this.cantSales = cantSales;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
