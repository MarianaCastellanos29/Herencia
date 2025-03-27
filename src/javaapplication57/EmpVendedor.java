/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication57;

/**
 *
 * @author maria
 */
public class EmpVendedor extends Empleado {

    private  double totalVentas;
    private static final double SALARIO_MINIMO = 1160000;

    public EmpVendedor(String registro, String nombre, String departamento, String puesto, double totalVentas) {
           super(registro, nombre, departamento, puesto);
        this.totalVentas = totalVentas;
    }

   public double calcularSueldoQuincenal() {
        return SALARIO_MINIMO + (totalVentas * 0.02);
    }
}
    
