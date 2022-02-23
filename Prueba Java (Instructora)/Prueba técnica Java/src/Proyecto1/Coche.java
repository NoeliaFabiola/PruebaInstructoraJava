package Proyecto1;
public class Coche {
    //Atributos    
    private String modelo;
    private String color;
    private int año; 
    private String chasis; 
    private String propietario; 
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroDePuertas;
    private boolean techoSolar;
    private int numeroDeMarchas;
    private boolean cajaDeCambiosAutomatica; 
    private int volumenDeCombustible;

    //Se implementa el método acelerar que aumenta la velocidad de 1 en 1 km / h
    public void acelerar(int velocidadActual){
        int acelerar = velocidadActual ++;  
    }
    //Se implementa el método de los frenos que detiene el coche - Velocidad = 0 km/h
    public void frenar(int velocidadActual){
        int frenar = velocidadActual = 0;  
    }
    //Se implementa el método reducir que disminuye la velocidad de 1 en 1 km / h
    public void reducir(int velocidadActual){
        int reducir = velocidadActual --;  
    }
    // Setters y getters
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getChasis() {
        return this.chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return this.velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getNumeroDePuertas() {
        return this.numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public boolean isTechoSolar() {
        return this.techoSolar;
    }

    public boolean getTechoSolar() {
        return this.techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public int getNumeroDeMarchas() {
        return this.numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public boolean isCajaDeCambiosAutomatica() {
        return this.cajaDeCambiosAutomatica;
    }

    public boolean getCajaDeCambiosAutomatica() {
        return this.cajaDeCambiosAutomatica;
    }

    public void setCajaDeCambiosAutomatica(boolean cajaDeCambiosAutomatica) {
        this.cajaDeCambiosAutomatica = cajaDeCambiosAutomatica;
    }

    public int getVolumenDeCombustible() {
        return this.volumenDeCombustible;
    }

    public void setVolumenDeCombustible(int volumenDeCombustible) {
        this.volumenDeCombustible = volumenDeCombustible;
    }
}
