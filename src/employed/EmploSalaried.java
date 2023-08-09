package employed;

/* 
 * 
 * EmpleadoAsalariado: Otra subclase de Empleado que representa a los empleados que 
 * tienen un salario fijo mensual. Debe tener un método para calcular el salario a pagar 
 * considerando bonificación y descuentos por IGSS.
 * 
 * 
*/

// Clase EmpleadoAsalariado que hereda de la clase Empleado
public class EmploSalaried extends EmployedClass {

    // Constructor de la clase EmpleadoAsalariado que llama al constructor de la
    // clase padre
    public EmploSalaried(int id, String name, String lastname, double salary) {
        // Llamada al constructor de la clase padre para inicializar atributos
        super(id, name, lastname, salary);
    }

    // Implementación del método abstracto calculateSalary() de la clase padre
    @Override
    public double calculateSalary() {
        // Definición de bonificación y cálculo de descuento IGSS
        double boni = 250;
        double IGSS = super.getSalary() * 0.0483;

        // Impresión de información sobre bonificación y descuento
        System.out.println("la bonificación de ley Q" + boni + " y se le restara el IGSS Q" + IGSS);

        // Cálculo del salario neto
        return (getSalary() + boni) - (IGSS);
    }
}
