package Proyecto3;

public class Empleado {
    String nombre;
    String apellido;
    double salarioMensual;
    
    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return this.salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //Constructor
    public Empleado(String nombre, String apellido, double salarioMensual){
    this.nombre = nombre;
    this.apellido = apellido;
    this.salarioMensual = salarioMensual;

    }
}
