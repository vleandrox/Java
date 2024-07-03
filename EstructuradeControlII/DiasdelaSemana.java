package EstructuradeControlII;

import java.util.Scanner;
public class DiasdelaSemana {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dias de la semana");
        System.out.print("Ingresa un numero de 1 a 7: ");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("La semana solo tiene 7 dias");
        }
    }
}
