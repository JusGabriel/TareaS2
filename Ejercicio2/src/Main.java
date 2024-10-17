//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Empleado {
    String nombre, cargo, fechaIngreso;
    double salario;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Empleado[] empleados= new Empleado[3];

        for (int i = 0; i < 3; i++) {
            empleados[i] = new Empleado();
            System.out.println ("Empleado "+(i + 1) + ":");
            System.out.print ("Nombre: ");
            empleados[i].nombre =scanner.nextLine();
            System.out.print ("Cargo: ");
            empleados[i].cargo =scanner.nextLine();
            System.out.print ("Salario: ");
            empleados[i].salario= scanner.nextDouble();
            scanner.nextLine();
            System.out.print ("Fecha de ingreso: ");
            empleados[i].fechaIngreso =scanner.nextLine();
        }

        System.out.println("Información de empleados:");
        for (int i=0; i<3; i++) {
            System.out.println("Empleado "+ (i + 1)+": "+empleados[i].nombre +", "+ empleados[i].cargo+", "+empleados[i].salario + ", "+ empleados[i].fechaIngreso);
        }
    }
}

