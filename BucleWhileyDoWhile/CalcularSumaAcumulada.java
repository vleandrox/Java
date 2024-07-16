package BucleWhileyDoWhile;
import java.util.Scanner;

public class CalcularSumaAcumulada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Suma acumulada de numeros enteros");
        System.out.print("Ingresa un numero: ");
        int num = entrada.nextInt();
        int suma = 0;
        do {
            suma += num;
            System.out.print("Desea continuar? (s/n): ");
            char continuar = entrada.next().charAt(0);
            if (continuar == 'n') {
                break;
            }
            else if (continuar == 's') {
                System.out.print("Ingresa un numero: ");
                num = entrada.nextInt();
            }
        } while (num != 0);
        System.out.println("La suma acumulada de los numeros es: " + suma);

    }
    
}
