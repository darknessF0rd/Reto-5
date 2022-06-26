package clases;

public class Motor {
    //Atributos
    private int cilindraje;
    private String marca;
    private String referencia;
    private double peso;
    private String descripcion;

    //Contructores
    public Motor() {
    }
    public Motor(int cilindraje, String marca, String referencia, double peso, String descripcion) {
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.referencia = referencia;
        this.peso = peso;
        this.descripcion = descripcion;
    }
}
