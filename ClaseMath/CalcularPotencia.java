package ClaseMath;

import java.util.Scanner;
public class CalcularPotencia {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular Potencia");
        System.out.print("Ingresa la base: ");
        int base = entrada.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = entrada.nextInt();        
        System.out.print("El resultado es: " + Math.pow(base, exponente));

    }
}
