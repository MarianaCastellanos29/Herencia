/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication57;

/**
 *
 * @author maria
 */
public class EmpMecanico extends Empleado {

    private double totalTrabajos;

    public EmpMecanico(String registro, String nombre, String departamento, String puesto, double totalTrabajos) {
   super(registro, nombre, departamento, puesto);
        this.totalTrabajos = totalTrabajos;
    }

    public double calcularSueldoQuincenal() {
        return totalTrabajos * 0.04;
    }
}
