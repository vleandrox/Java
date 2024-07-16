package BucleWhileyDoWhile;
import java.util.Scanner;
public class TablaMultiplicar {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Tablas de Multiplicar");
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();
        while (numero!=0) {
            System.out.println("Tablas de Multiplicar del "+numero);
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.print("Ingresa un numero: ");
            numero = entrada.nextInt();
        }
        System.out.println("Fin");

    }

}
