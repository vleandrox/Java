package EstructuradeControl2;
import java.util.Scanner;
public class OpcionesMenu {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Opciones de menu");
        System.out.print("Ingresa una opción: ");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Guardar");
                break;
            case 2:
                System.out.println("Cargar");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
