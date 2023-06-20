import conicas2. *;
import java.util.Scanner;
public class main {
    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0;
    public static void main(String[] args) {

        Elipse elipse1 = new Elipse(9,8);
        circunferencia_grupo2 circulo1 = new circunferencia_grupo2(5,23);
        hiperbole hiperbole2 = new hiperbole(5,9);
        Parabola_Equipo2 parabola2 = new Parabola_Equipo2(5,9,7,8,9);

        while (opcion != 5){
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    System.out.println("\n----- Ha seleccionado Parabola -----");
                    System.out.println("\nDatos de la parabola: ");
                    parabola2.Parabola_Equipo2_ImpVer();
                    break;
                case 2:
                    System.out.println("\n----- Ha seleccionado Circunferencia -----");
                    System.out.println("\nDatos de la circunferencia: ");
                    circulo1.imprimir_Datos();

                    break;
                case 3:
                    System.out.println("\n----- Ha seleccionado Hiperbole -----");
                    System.out.println("\nDatos de la hiperbole: ");
                    hiperbole2.variables();
                    break;
                case 4:
                    System.out.println("\n----- Ha seleccionado Elipse -----");
                    System.out.println("\nDatos de la elipse: ");
                    elipse1.imprimir_Datos();

                    break;
                case 5:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
            }
        }
    }
    public static int menuPrincipal() {
        System.out.println("\n---------- Menu de fijuras de equipo 2 ---------\n");
        System.out.println("En este menu contamos con 4 figuras mostradas a continuacion.\n");
        System.out.println("1. Circunferencia ");
        System.out.println("2. Elipse ");
        System.out.println("3. Hiperbole ");
        System.out.println("4. Parabola ");
        System.out.println("5. Salir \n");
        System.out.print("Selecione una opción: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 5) {
            System.out.println("\n=================================================================================");
            System.out.println(" Ingrese una opción válida");
            System.out.println("=================================================================================");
            System.out.print("\nDígite la opción: ");
            opcion = scanner.nextInt();
        }
        return opcion;
    }
}
