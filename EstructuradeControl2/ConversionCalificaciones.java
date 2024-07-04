package EstructuradeControl2;

import java.util.Scanner;
public class ConversionCalificaciones {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversion de calificaciones");
        System.out.print("Ingresa la calificación de 1 a 5 : ");
        int calif = entrada.nextInt();
        switch (calif) {
            case 1:
                System.out.print("Muy desaprobado");
                break;
            case 2:
                System.out.print("Deficiente");           
                break;
            case 3:
                System.out.print("Suficiente");
                break;
            case 4:
                System.out.print("Notable");
                break;
            case 5:
                System.out.print("Sobresaliente");
                break;
            default:
                System.out.print("Calificación no válida");

        }
    }
}
