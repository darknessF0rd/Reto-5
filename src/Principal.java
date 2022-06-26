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
                    "1)Registrar Paneles. " +
                    "2)Registrar Ventas. " +
                    "3)Registrar Seguros. " +
                    "4)Salir.");
            String opciones = sc.nextLine();
            switch (opciones){
                case "1":
                    Panel panel = new Panel();

                    break;
                case "2":
                    System.out.println("2) Registrar ventas: ");
                    break;
                case "3":
                    System.out.println("3) Registrar Seguros: ");
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
