package employed;

/*
 * 
 * EmpleadoPorHoras: Una subclase de Empleado que representa a los empleados que son
 * pagados por horas trabajadas. Debe tener un atributo para almacenar el número de horas
 * trabajadas y un método para calcular el salario total considerando una tarifa por hora
 * 
 */

public class EmploForHour extends EmployedClass {

    private int cantHours;
    private double tarifa;

    @Override
    public double calculateSalary() {
        super.setSalary((this.tarifa * this.cantHours));
        return super.getSalary();
    }

    public EmploForHour(int id, String name, String lastname, double salary, int cantHours, double tarifa) {
        super(id, name, lastname, salary);
        this.cantHours = cantHours;
        this.tarifa = tarifa;
    }

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
