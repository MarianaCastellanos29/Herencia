/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication57;


import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        char continuar;

        do {
            System.out.println("Seleccione el tipo de empleado:");
            System.out.println("1. Administrativo");
            System.out.println("2. Mecanico");
            System.out.println("3. Vendedor");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Ingrese el registro: ");
            String registro = entrada.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese el departamento: ");
            String departamento = entrada.nextLine();
            System.out.print("Ingrese el puesto: ");
            String puesto = entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el sueldo mensual: ");
                    double sueldoMensual = entrada.nextDouble();
                    empleados.add(new EmpAdmvo(registro, nombre, departamento, puesto, sueldoMensual));
                    break;
                case 2:
                    System.out.print("Ingrese el total de trabajos realizados: ");
                    double totalTrabajos = entrada.nextDouble();
                    empleados.add(new EmpMecanico(registro, nombre, departamento, puesto, totalTrabajos));
                    break;
                case 3:
                    System.out.print("Ingrese el total de ventas realizadas: ");
                    double totalVentas = entrada.nextDouble();
                    empleados.add(new EmpVendedor(registro, nombre, departamento, puesto, totalVentas));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.print("Desea agregar otro empleado? (S/N): ");
            continuar = entrada.next().charAt(0);
            entrada.nextLine(); 
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Reporte Quincenal de Empleados:");
        for (Empleado emp : empleados) {
            System.out.println("Nombre: " + emp.obtenerNombre());
            System.out.println("Departamento: " + emp.obtenerDepartamento());
            System.out.println("Puesto: " + emp.obtenerPuesto());
            System.out.println("Sueldo Quincenal: $" + emp.calcularSueldoQuincenal());
        }
    }
}
