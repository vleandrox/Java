package BucleWhileyDoWhile;

import java.util.Scanner;

public class MenuCon5Opciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Bienvenido al Menu");
        String[] menu = {
                "1. Comprar Producto",
                "2. Realizar Devolución",
                "3. Ver Pedidos",
                "4. Preguntas Frecuentes",
                "5. Salir"
        };
        int ope = 0;
        while (ope != 5) {
            for (String string : menu) {
                System.out.println(string);
            }
            System.out.print("Ingresa una opcion: ");
            ope = entrada.nextInt();

            switch (ope) {
                case 1:
                    System.out.println("Has elegido Comprar Producto.");
                    break;
                case 2:
                    System.out.println("Has elegido Realizar Devolución.");
                    break;
                case 3:
                    System.out.println("Has elegido Ver Pedidos.");
                    break;
                case 4:
                    System.out.println("Has elegido Preguntas Frecuentes.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

            System.out.println("Hasta pronto");
        }
    }
}
