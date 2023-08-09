package home;

import java.util.Scanner;

import employed.EmploForHour;
import employed.EmployedClass;

public class mainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Empleado");
        String name = s.nextLine();

        System.out.println("\nIngrese el Apellido del empleado");
        String lastname = s.nextLine();

        System.out.println("Ingrese el tipo de empleado\n 1-Por hora\n 2-Asalariado \n 3-PorComision \n 4-Salir\nopcion : ");
        int key = s.nextInt();

        switch (key) {
            case 1: {

                System.out.println("Ingrese cant de Horas : ");
                int hours = s.nextInt();

                // La tarifa la define la empresa osea nosotros como desarrolladores Q27 la hora
                // en este caso el salario se pone 0 para que se calcule despues
                EmployedClass emploForHour = new EmploForHour(1, name, lastname, 0, hours, 35);

                System.out.println(
                        "Salario final del empleado No." + emploForHour.getId() + " - " + emploForHour.getName() + " "
                                + emploForHour.getLastname()
                                + " = Salaraio Calculado (tarifa * horas): " + emploForHour.calculateSalary());

                break;
            }
            default:
                break;
        }

        s.close();

    }

}
