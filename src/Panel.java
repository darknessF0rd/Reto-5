public class Panel {
    //Atributos
    private int identificarEmpresa;
    private int identificarSerie;
    private String descripcion;
    private String tipoPanel;
    private String nombreModelo;
    private int anioFabricacion;
    private double precioVenta;
    private String antiguedad;

    //Constructores
    public Panel() {
    }
    public Panel(int identificarEmpresa, int identificarSerie, String descripcion, String tipoPanel, String nombreModelo, int anioFabricacion, double precioVenta) {
        this.identificarEmpresa = identificarEmpresa;
        this.identificarSerie = identificarSerie;
        this.descripcion = descripcion;
        this.tipoPanel = tipoPanel;
        this.nombreModelo = nombreModelo;
        this.anioFabricacion = anioFabricacion;
        this.precioVenta = precioVenta;
    }

    //Metodos
    public String calcularAntigueadadPanel(){
        int anioActual = 2022;
        if((anioActual - anioFabricacion) >= 0 && (anioActual - anioFabricacion) <= 1){
            this.antiguedad = "nuevo";
        }
        else if((anioActual-anioFabricacion) > 1 && (anioActual-anioFabricacion) <= 4){
            this.antiguedad = "medianamente usado";
        }
        else if((anioActual-anioFabricacion) > 5){
            this.antiguedad = "usado";
        }
        else{
        }
        return this.antiguedad;
    }
}
