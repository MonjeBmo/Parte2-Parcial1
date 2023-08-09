package home;

import java.util.Scanner;

import employed.EmploCommissioned;
import employed.EmploForHour;
import employed.EmploSalaried;
import employed.EmployedClass;

public class mainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int key = 0;

        do {
            System.out.println("<---Ingreso de un nuevo empleado--->");
            System.out.println("Ingrese el nombre del Empleado");
            String name = s.nextLine();

            System.out.println("\nIngrese el Apellido del empleado");
            String lastname = s.nextLine();

            System.out.println(
                    "Ingrese el tipo de empleado\n 1-Por hora\n 2-Asalariado \n 3-PorComision \n 4-Salir\nopcion : ");
            key = s.nextInt();

            switch (key) {
                case 1: {

                    System.out.println("Ingrese cant de Horas : ");
                    int hours = s.nextInt();

                    // La tarifa la define la empresa osea nosotros como desarrolladores Q27 la hora
                    // en este caso el salario se pone 0 ya que se calcule despues
                    EmployedClass emploForHour = new EmploForHour(1, name, lastname, 0, hours, 35);

                    System.out.println(
                            "Salario final del empleado No." + emploForHour.getId() + " - " + emploForHour.getName()
                                    + " "
                                    + emploForHour.getLastname()
                                    + " = Salaraio Calculado (tarifa * horas): " + emploForHour.calculateSalary());

                    break;
                }
                case 2: {

                    System.out.println("Ingrese Salario Base : ");
                    int salaryBase = s.nextInt();

                    EmployedClass emploSalaried = new EmploSalaried(2, name, lastname, salaryBase);

                    System.out.println(
                            "Salario final del empleado No." + emploSalaried.getId() + " - " + emploSalaried.getName()
                                    + " "
                                    + emploSalaried.getLastname()
                                    + " = Salaraio Calculado (SalarioBase - (Boni+IGG)): "
                                    + emploSalaried.calculateSalary());

                    break;
                }
                case 3: {

                    System.out.println("Ingrese cantidad vendida en el Mes : ");
                    double cantSales = s.nextInt();

                    // Nosotros como desarroladores definimos la comision para evitar errores como
                    // el que de cobrar el 100% de la comision
                    // DE la misma manera definimos un salario base de 0 ya que solo gana comisiones
                    // por total de la venta del mes
                    EmployedClass emploCommissioned = new EmploCommissioned(3, name, lastname, 1000, cantSales, 0.05);

                    System.out.println(
                            "Salario final del empleado No." + emploCommissioned.getId() + " - "
                                    + emploCommissioned.getName() + " "
                                    + emploCommissioned.getLastname()
                                    + " = Salaraio Calculado (Salario base + (Venta * comision)): "
                                    + emploCommissioned.calculateSalary());

                    break;
                }
                case 4: {
                    System.out.println("Cantidad de empleados ingresado -> " + employed.EmployedClass.countEmployed);
                    System.out.println("Adios!, Feliz Dia.");
                }

                default:
                    break;
            }

        } while (key != 4);

        s.close();

    }

}
