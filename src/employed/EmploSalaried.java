package employed;

/* 
 * 
 * EmpleadoAsalariado: Otra subclase de Empleado que representa a los empleados que 
 * tienen un salario fijo mensual. Debe tener un método para calcular el salario a pagar 
 * considerando bonificación y descuentos por IGSS.
 * 
 * 
*/

public class EmploSalaried extends EmployedClass {

    public EmploSalaried(int id, String name, String lastname, double salary) {
        super(id, name, lastname, salary);
    }

    @Override
    public double calculateSalary() {
        double boni = 250;
        double IGSS = super.getSalary() * 0.0483;
        System.out.println("se le restara la bonificacion Q" + boni + " y el IGSS Q" + IGSS);
        return getSalary() - (boni + IGSS);
    }

}
