
package javaapplication57;

class Empleado {
    protected String registro;
    protected String nombre;
    protected String departamento;
    protected String puesto;

    public Empleado(String registro, String nombre, String departamento, String puesto) {
        this.registro = registro;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public String obtenerRegistro() {
        return registro;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerDepartamento() {
        return departamento;
    }
    public String obtenerPuesto() {
        return puesto;
    }
    public double calcularSueldoQuincenal() {
        return 0.0; 
    }
}
