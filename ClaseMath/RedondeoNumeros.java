package ClaseMath;

import java.util.Scanner;
public class RedondeoNumeros {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Redondeo de numeros");
        System.out.print("Ingresa un numero en decimal: ");
        float num = entrada.nextFloat();
        System.out.println("Redondeo: " + Math.round(num));
    }
}
