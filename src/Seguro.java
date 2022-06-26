import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Seguro {
    //Atributos
    private String nombreEmpresaSeguro;
    private LocalDate fechaInicioCobertura;
    private LocalDate fechaFinalCobertura;
    private String descripcion;
    private int identificadirSeries;

    //Constructores
    public Seguro() {
        this.fechaInicioCobertura = LocalDate.of(2022, Month.MAY,01);
        this.fechaFinalCobertura = LocalDate.of(2022,Month.DECEMBER,31);
    }

    public Seguro(String nombreEmpresaSeguro, LocalDate fechaInicioCobertura, LocalDate fechaFinalCobertura, String descripcion, int identificadirSeries) {
        this.nombreEmpresaSeguro = nombreEmpresaSeguro;
        this.fechaInicioCobertura = fechaInicioCobertura;
        this.fechaFinalCobertura = fechaFinalCobertura;
        this.descripcion = descripcion;
        this.identificadirSeries = identificadirSeries;
    }

    //Metodos
    public long calcularNumeroDiasCovertura(){
        Duration covertura = Duration.between(fechaInicioCobertura.atStartOfDay(), fechaFinalCobertura.atStartOfDay());
        long diasCovertura = covertura.toDays();
        return diasCovertura;
    }
}
