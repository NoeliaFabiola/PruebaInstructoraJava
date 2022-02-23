package Proyecto2;

public class Factura {
    String numeroDeFactura = "0001";
    String descripcion = "Factura expedida por suministros informaticos";
    private int importeDeArticulo = 54;
    private double precioPorArticulo = 456;

    //Constructor
    public Factura(String numeroDeFactura, String descripcion, int importeDeArticulo, double precioPorArticulo){
        this.numeroDeFactura = numeroDeFactura;
        this.descripcion = descripcion;
        this.importeDeArticulo = importeDeArticulo;
        this.precioPorArticulo = precioPorArticulo;
    }
    public Factura(int i, int j) {
    }
    public void mostrarFactura(){
        System.out.println("El número de factura es: "+numeroDeFactura+"\nDescripción: "+descripcion+"\nImporte de artículo: "+importeDeArticulo+"\nPrecio por artículo "+precioPorArticulo);
    }
    //Constructor
    public double getTotalInvoice(int importeDeArticulo, double precioPorArticulo){
        this.importeDeArticulo = importeDeArticulo;
        return this.precioPorArticulo = precioPorArticulo;
    }
    public void mostrarGetTotalInvoice(){
        System.out.println("El importe total de la factura es: " + importeDeArticulo + precioPorArticulo);
    }


    //Getters y Setters
    public String getNumeroDeFactura() {
        return this.numeroDeFactura;
    }

    public void setNumeroDeFactura(String numeroDeFactura) {
        this.numeroDeFactura = numeroDeFactura;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImporteDeArticulo() {
        return this.importeDeArticulo;
    }

    public void setImporteDeArticulo(int importeDeArticulo) {
        this.importeDeArticulo = importeDeArticulo;
    }

    public double getPrecioPorArticulo() {
        return this.precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }
    public static int MainTotalInvoice(int i, int j) {
        return 0;
    }
}
