package EstructuradeControl3;

import java.util.Scanner;
public class DivisionSegura {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Division Segura");
        System.out.print("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();    
        try {
            float division = num1 / num2;
            System.out.println("La division es: " + division);
        } catch (Exception e) {
            System.out.println("No se puede dividir por 0");
        }
    }
}
