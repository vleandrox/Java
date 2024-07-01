package ActividadIntegradora;

import java.io.CharConversionException;
import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer valor: ");
        float num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        float num2 = entrada.nextInt();
        System.out.println(" 1 - Sumar ");
        System.out.println(" 2 - Restar ");
        System.out.println(" 3 - Multiplicar ");
        System.out.println(" 4 - Dividir ");
        System.out.print("Ingresa una opción: ");        
        int operacion = entrada.nextInt();
        float resultado = (operacion == 1) ? num1+num2 : 
                          (operacion == 2) ? num1-num2 : 
                          (operacion == 3) ? num1*num2 : num1/num2;
        System.out.println("El resultado es: " + resultado);

    }
}
