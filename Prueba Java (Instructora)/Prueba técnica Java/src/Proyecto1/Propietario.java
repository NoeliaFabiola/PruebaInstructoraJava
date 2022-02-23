package Proyecto1;
public class Propietario {
    //Atributos    
    private String nombre;
    private String apellido;
    private String curp; 
    private String rfc; 
    private int fechaDeNacimiento; 
    private String calle;
    private String colonia;
    private String ciudad;
    private int codigoPostal;
    private String estado;

    //Constructor
    public Propietario(String nombre, String apellido, String curp, String rfc){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.rfc = rfc;
    }
    public void mostrarDatos(){
        System.out.println("Nombre de usuario: "+nombre+" "+apellido+"\nLa CURP es: "+curp+"\nLa RFC es: "+rfc);
    }

    // Setters y getters
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

    public String getCurp() {
        return this.curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return this.colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
