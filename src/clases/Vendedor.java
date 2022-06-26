package clases;

public class Vendedor {
    //Atributos
    private int numeroDocumento;
    private  String nombres;
    private String apellidos;
    private int edad;
    private int valorParcialVendido;
    private double valorTotalVendido;
    private String descripcion;
    private int anioIngreso;

    //Contructores
    public Vendedor() {
    }

    public Vendedor(int numeroDocumento, String nombres, String apellidos, int edad, int valorParcialVendido, double valorTotalVendido, String descripcion, int anioIngreso) {
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.valorParcialVendido = valorParcialVendido;
        this.valorTotalVendido = valorTotalVendido;
        this.descripcion = descripcion;
        this.anioIngreso = anioIngreso;
    }

    //Metodos
    public String conocerReputacionVendedor(){
        String reputacionActual;
        if(this.valorParcialVendido == 0){
            reputacionActual = "novato";
            return reputacionActual;
        }
        else if(this.valorParcialVendido > 0 && this.valorParcialVendido <= 500000000){
            reputacionActual = "principiante";
            return reputacionActual;
        }
        else if(this.valorParcialVendido > 500000000 && this.valorParcialVendido <= 2000000000){
            reputacionActual = "intermedio";
            return reputacionActual;
        }
        else{
            reputacionActual = "avanzado";
            return reputacionActual;
        }
    }
    public String conocerReputacionAnio(){
        int anioActual = 2022;
        String reputacionEnAnios;
        if(valorTotalVendido / (anioActual - anioIngreso) == 0){
            reputacionEnAnios = "malo";
            return reputacionEnAnios;
        }
        else if(valorTotalVendido / (anioActual - anioIngreso) > 0 && valorTotalVendido / (anioActual - anioIngreso) <= 500000000){
            reputacionEnAnios = "regular";
            return reputacionEnAnios;
        }
        else if(valorTotalVendido / (anioActual - anioIngreso) > 500000000 && valorTotalVendido / (anioActual - anioIngreso) <= 2000000000){
            reputacionEnAnios = "bueno";
            return reputacionEnAnios;
        }
        else{
            reputacionEnAnios = "Excelente";
            return reputacionEnAnios;
        }
    }

}
