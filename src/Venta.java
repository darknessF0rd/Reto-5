import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Venta {
    //Atributos
    private int identificadorSerie;
    private LocalDate fecha;
    private LocalTime hora;
    private String tipoDcumento;
    private int numeroDocumento;
    private String nombreCompleto;
    private double precioVenta;
    private String descripcion;

    //Constructores
    public Venta() {
        this.fecha = LocalDate.of(2021, Month.MAY, 20);
    }
    public Venta(int identificadorSerie, LocalDate fecha, LocalTime hora, String tipoDcumento, int numeroDocumento, String nombreCompleto, double precioVenta, String descripcion) {
        this.identificadorSerie = identificadorSerie;
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDcumento = tipoDcumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.precioVenta = precioVenta;
        this.descripcion = descripcion;
    }

    //Metodos
    public long calcularNumeroDiasPartirVenta(){
        LocalDate fechaActual = LocalDate.now();
        Duration diferencia = Duration.between(fecha.atStartOfDay(), fechaActual.atStartOfDay());
        long difereciaDias = diferencia.toDays();
        return difereciaDias;
    }
    //Getter

    public int getIdentificadorSerie() {
        return identificadorSerie;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getTipoDcumento() {
        return tipoDcumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }
    //Setter
    public void setIdentificadorSerie(int identificadorSerie) {
        this.identificadorSerie = identificadorSerie;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setTipoDcumento(String tipoDcumento) {
        this.tipoDcumento = tipoDcumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
