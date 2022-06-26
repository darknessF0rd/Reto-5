package clases;

public class Automovil {
    //Atributos
    private String placa;
    private String marca;
    private String modelo;
    private double kilometraje;
    private String color;
    private double precio;
    private String descripcion;
    private Vendedor vendedor = new Vendedor();
    private Motor motor = new Motor();
    private Llanta llanta = new Llanta();
    private int anioFabricacion;
    private String antiguedad;

    //constructores
    public Automovil(){
    }

    public Automovil(String placa, String marca, String modelo, double kilometraje, String color, double precio, String descripcion, Vendedor vendedor, Motor motor, Llanta llanta, int anioFabricacion, String antiguedad) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.precio = precio;
        this.descripcion = descripcion;
        this.vendedor = vendedor;
        this.motor = motor;
        this.llanta = llanta;
        this.anioFabricacion = anioFabricacion;
        this.antiguedad = antiguedad;
    }

    //Metodos
    public String calcularUsoAutomovil(){
        String uso;
        if(this.kilometraje == 0){
            uso = "0 km";
            return uso;
        }
        else if((this.kilometraje > 0) && (this.kilometraje <= 1000)){
            uso = "nuevo";
            return uso;
        }
        else if((this.kilometraje > 1000) && (this.kilometraje <= 20000)){
            uso = "casi nuevo";
            return uso;
        }
        else if((this.kilometraje > 20000) && (this.kilometraje <= 100000)){
            uso = "usado";
            return uso;
        }
        else{
            uso = "muy usado";
            return uso;
        }
    }
    public String calcularAntiguedadAutomovil(){
        int anioActual = 2022;
        if(anioActual - anioFabricacion <= 2){
            this.antiguedad = "ultimo modelo";
            return antiguedad;
        }
        else if((anioActual - anioFabricacion) > 2 && (anioActual - anioFabricacion <= 5)){
            this.antiguedad = "nuevo";
            return antiguedad;
        }
        else if((anioActual - anioFabricacion > 5) && (anioActual - anioFabricacion <= 15)){
            this.antiguedad = "intermedio";
            return antiguedad;
        }
        else{
            this.antiguedad = "antiguo";
            return antiguedad;
        }
    }
}
