import java.util.ArrayList;

public class Empresa {
    //Atributos
    private ArrayList<Panel> paneles = new ArrayList<Panel>();
    private ArrayList<Venta> ventas = new ArrayList<Venta>();
    private ArrayList<Seguro> seguros = new ArrayList<Seguro>();

    //Constructores
    public Empresa() {
    }
    public Empresa(ArrayList<Panel> paneles, ArrayList<Venta> ventas, ArrayList<Seguro> seguros) {
        this.paneles = paneles;
        this.ventas = ventas;
        this.seguros = seguros;
    }

    //Metodos
    public void agregarPanel(Panel panel){
        paneles.add(panel);
    }
    public void agregarVenta(){

    }
    public void agregarSeguro(){

    }
}
