import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        boolean salir = false;
        Empresa empresa = new Empresa();
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL RETO 4");
        do{
            System.out.println("Elija una de las 4 opciones: " +
                    "\n1)Registrar Paneles. " +
                    "\n2)Registrar Ventas. " +
                    "\n3)Registrar Seguros. " +
                    "\n4)Salir.");
            String opciones = sc.nextLine();
            switch (opciones){
                case "1":
                    System.out.println("1)Registrar panel:");
                    Panel panel = new Panel();

                    System.out.println("Identificador para la empresa(int): ");
                    int identificarEmpresa = Integer.parseInt(sc.nextLine());
                    panel.setIdentificarEmpresa(identificarEmpresa);
                    System.out.println("Identificador de serie(int): ");
                    int identificadorSerie = Integer.parseInt(sc.nextLine());
                    panel.setIdentificarSerie(identificadorSerie);
                    System.out.println("Descripcion(String): ");
                    String descripcion = sc.nextLine();
                    panel.setDescripcion(descripcion);
                    System.out.println("Tipo de panel(String): ");
                    String tipoPanel = sc.nextLine();
                    panel.setTipoPanel(tipoPanel);
                    System.out.println("Nombre del modelo(String): ");
                    String nombreModelo = sc.nextLine();
                    panel.setNombreModelo(nombreModelo);
                    System.out.println("Anio Fabricacion(int): ");
                    int anioFabricacion = Integer.parseInt(sc.nextLine());
                    panel.setAnioFabricacion(anioFabricacion);
                    System.out.println("Precio de venta(int): ");
                    int precioVenta = Integer.parseInt(sc.nextLine());
                    panel.setPrecioVenta(precioVenta);

                    empresa.addPanel(panel);;
                    System.out.println("\nSi desea ver los paneles registrados ingrese el numero 1: ");

                    String opcion = sc.nextLine();
                    switch (opcion){
                        case "1":
                            empresa.getPaneles();
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    System.out.println("2) Registrar venta: ");
                    Venta venta = new Venta();

                    System.out.println("Identificador de serie(int): ");
                    int identificadorDeSerie = Integer.parseInt(sc.nextLine());
                    venta.setIdentificadorSerie(identificadorDeSerie);
                    System.out.println("Fecha(DD/MM/AA): ");
                    LocalDate fecha;
                    LocalTime hora;
                    String tipoDcumento;
                    int numeroDocumento;
                    String nombreCompleto;
                    double precioDeVenta;
                    String descripcion2;

                    empresa.addVenta(venta);
                    System.out.println("Si desea ver las ventas registradas ingrese el numero 1: ");
                    String opcion2 = sc.nextLine();
                    switch (opcion2){
                        case "1":
                            empresa.getVentas();
                            break;
                        default:
                            break;
                    }
                    break;
                case "3":
                    System.out.println("3) Registrar Seguro: ");
                    Seguro seguro = new Seguro();
                    empresa.addSeguro(seguro);
                    System.out.println("Si desea ver los seguros registrados ingrese el numero 1: ");
                    String opcion3 = sc.nextLine();
                    switch (opcion3){
                        case "1":
                            empresa.getSeguros();
                            break;
                        default:
                            break;
                    }
                    break;
                case "4":
                    System.out.println("Hasta la proxima.");
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion es incorrecta");
                    break;
            }
        }while(!salir);
    }
}

