import java.time.*;
import java.time.temporal.ChronoUnit;

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
        this.fecha = LocalDate.of(2021,Month.MAY, 20);
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
}
