public class Panel {
    //Atributos
    private int identificarEmpresa;
    private int identificarSerie;
    private String descripcion;
    private String tipoPanel;
    private String nombreModelo;
    private int anioFabricacion;
    private int precioVenta;
    private String antiguedad;

    //Constructores
    public Panel() {
    }
    public Panel(int identificarEmpresa, int identificarSerie, String descripcion, String tipoPanel, String nombreModelo, int anioFabricacion, int precioVenta) {
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

    //Getter
    public int getIdentificarEmpresa() {
        return identificarEmpresa;
    }

    public int getIdentificarSerie() {
        return identificarSerie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipoPanel() {
        return tipoPanel;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    //Setter
    public void setIdentificarEmpresa(int identificarEmpresa) {
        this.identificarEmpresa = identificarEmpresa;
    }

    public void setIdentificarSerie(int identificarSerie) {
        this.identificarSerie = identificarSerie;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipoPanel(String tipoPanel) {
        this.tipoPanel = tipoPanel;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
}

