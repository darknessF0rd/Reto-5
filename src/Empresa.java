import java.util.ArrayList;

public class Empresa {
    //Atributos
    private ArrayList<Panel> paneles = new ArrayList<Panel>();
    private ArrayList<Venta> ventas = new ArrayList<Venta>();
    private ArrayList<Seguro> seguros = new ArrayList<Seguro>();
    private int totalPaneles = 0;
    private int totalVentas = 0;
    private int totalSeguros = 0;

    //Constructores
    public Empresa() {
    }
    public Empresa(ArrayList<Panel> paneles, ArrayList<Venta> ventas, ArrayList<Seguro> seguros) {
        this.paneles = paneles;
        this.ventas = ventas;
        this.seguros = seguros;
    }

    //Metodos
    public void addPanel(Panel panel){
        paneles.add(panel);
        totalPaneles++;
    }
    public void getPaneles(){
        for(int i = 0; i< paneles.size();i++){
            mostrarPaneles(paneles.get(i));
        }
    }
    public void mostrarPaneles(Panel panel){
        System.out.println("--------------------------------------");
        System.out.println("identificadorEmpresa: " + panel.getIdentificarEmpresa());
        System.out.println("identificadorSerie:" + panel.getIdentificarSerie());
        System.out.println("descripcion: " + panel.getDescripcion());
        System.out.println("tipoPanel: " + panel.getTipoPanel());
        System.out.println("nombreModelo: " + panel.getNombreModelo());
        System.out.println("anioFabricacion: " + panel.getAnioFabricacion());
        System.out.println("precioVenta: " + panel.getPrecioVenta());
        System.out.println("--------------------------------------");
    }
    public void addVenta(Venta venta){
        ventas.add(venta);
        totalVentas++;
    }
    public void getVentas(){
        for(int i = 0; i< ventas.size();i++){
            mostrarVentas(ventas.get(i));
        }
    }
    public void mostrarVentas(Venta venta){
        System.out.println("--------------------------------------");
        System.out.println("identificadorSerie: " + venta.getIdentificadorSerie());
        System.out.println("fecha:" + venta.getFecha());
        System.out.println("hora: " + venta.getHora());
        System.out.println("tipoDocumento: " + venta.getTipoDcumento());
        System.out.println("nombreDocumento: " + venta.getNumeroDocumento());
        System.out.println("precioVenta: " + venta.getPrecioVenta());
        System.out.println("descripcion: " + venta.getDescripcion());
        System.out.println("--------------------------------------");
    }
    public void addSeguro(Seguro seguro){
        seguros.add(seguro);
        totalSeguros++;
    }
    public void getSeguros(){
        for(int i = 0; i< seguros.size();i++){
            mostrarSeguros(seguros.get(i));
        }
    }
    public void mostrarSeguros(Seguro seguro){
        System.out.println("--------------------------------------");
        System.out.println("nombreEmpresaSeguro: " + seguro.getNombreEmpresaSeguro());
        System.out.println("fechaInicioCobertura:" + seguro.getFechaInicioCobertura());
        System.out.println("fechaFinalCobertura: " + seguro.getFechaFinalCobertura());
        System.out.println("descripcion: " + seguro.getDescripcion());
        System.out.println("identificadorSerie: " + seguro.getIdentificadorSeries());
        System.out.println("--------------------------------------");
    }

}
