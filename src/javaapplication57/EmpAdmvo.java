/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication57;

public class EmpAdmvo extends Empleado {

    private double sueldoMensual;

    public EmpAdmvo(String registro, String nombre, String departamento, String puesto, double sueldoMensual) {
    
     super(registro, nombre, departamento, puesto);
        this.sueldoMensual = sueldoMensual;
    }

   public double calcularSueldoQuincenal() {
        return sueldoMensual / 2;
    }
}
