package home;

import java.util.Scanner;

import employed.EmploCommissioned;
import employed.EmploForHour;
import employed.EmploSalaried;
import employed.EmployedClass;

public class mainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int key = 0, id = 0;

        // Ciclo principal para ingresar empleados y realizar cálculos
        do {
            id += 1;
            System.out.println("<--- Ingreso de un nuevo empleado --->");
            System.out.println("Ingrese el nombre del Empleado");
            String name = s.nextLine();

            System.out.println("\nIngrese el Apellido del empleado");
            String lastname = s.nextLine();

            System.out.println(
                    "Ingrese el tipo de empleado\n 1 - Por hora\n 2 - Asalariado \n 3 - Por Comision \n 4 - Salir\nOpcion: ");
            key = s.nextInt();

            switch (key) {
                case 1: {
                    // Ingresar empleado por hora
                    System.out.println("Ingrese cant de Horas : ");
                    int hours = s.nextInt();

                    // Crear objeto de tipo EmpleadoPorHora
                    // se define 0 el salario ya que gana por horas laboradas 
                    // se establece una tarifa de Q35 por hora y la definimos nosotros como desarrollador para evitar que cobren demasiado 
                    EmployedClass emploForHour = new EmploForHour(id, name, lastname, 0, hours, 35);

                    // Mostrar resultado del cálculo de salario por hora
                    System.out.println(
                            "Salario final del empleado No." + emploForHour.getId() + " - " + emploForHour.getName()
                                    + " "
                                    + emploForHour.getLastname()
                                    + " = Salaraio Calculado (tarifa * horas): " + emploForHour.calculateSalary());

                    break;
                }
                case 2: {
                    // Ingresar empleado asalariado
                    System.out.println("Ingrese Salario Base : ");
                    int salaryBase = s.nextInt();

                    // Crear objeto de tipo EmpleadoAsalariado
                    EmployedClass emploSalaried = new EmploSalaried(id, name, lastname, salaryBase);

                    // Mostrar resultado del cálculo de salario asalariado
                    System.out.println(
                            "Salario final del empleado No." + emploSalaried.getId() + " - " + emploSalaried.getName()
                                    + " "
                                    + emploSalaried.getLastname()
                                    + " = Salaraio Calculado (SalarioBase - (Boni+IGG)): "
                                    + emploSalaried.calculateSalary());

                    break;
                }
                case 3: {
                    // Ingresar empleado por comisión
                    System.out.println("Ingrese cantidad vendida en el Mes : ");
                    double cantSales = s.nextInt();

                    // Crear objeto de tipo EmpleadoPorComision
                    // Le definismo un salario base para que no sea poco su salario del empleado.
                    // definimos la comision de un 5% para evita que cobren el 100% de ganancia  
                    EmployedClass emploCommissioned = new EmploCommissioned(id, name, lastname, 1000, cantSales, 0.05);

                    // Mostrar resultado del cálculo de salario por comisión
                    System.out.println(
                            "Salario final del empleado No." + emploCommissioned.getId() + " - "
                                    + emploCommissioned.getName() + " "
                                    + emploCommissioned.getLastname()
                                    + " = Salaraio Calculado (Salario base + (Venta * comision)): "
                                    + emploCommissioned.calculateSalary());

                    break;
                }
                case 4: {
                    // Mostrar la cantidad de empleados ingresados y despedirse
                    System.out.println("Cantidad de empleados ingresado -> " + employed.EmployedClass.countEmployed);
                    System.out.println("Adios!, Feliz Dia.");
                }
                default:
                    System.out.println("Opcion invalida!");
                    break;
            }

        } while (key != 4);

        s.close();

    }
}
