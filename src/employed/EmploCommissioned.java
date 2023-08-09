package employed;

/*
 *
 *  EmpleadoPorComision: Una tercera subclase de Empleado que representa a los empleados
 *  que reciben una comisión por ventas realizadas. Debe tener atributos para almacenar el 
 *  monto total de ventas y la tasa de comisión. Debe tener un método para calcular el salario total.
 * 
 */

public class EmploCommissioned extends EmployedClass {

    private double cantSales;
    private double comision;

    public EmploCommissioned(int id, String name, String lastname, double salary, double cantSales, double comision) {
        super(id, name, lastname, salary);
        this.cantSales = cantSales;
        this.comision = comision;
    }

    @Override
    public double calculateSalary() {
        return (super.getSalary() + (this.cantSales * comision));
    }

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
