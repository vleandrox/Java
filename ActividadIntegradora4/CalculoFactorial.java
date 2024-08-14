package ActividadIntegradora4;
import java.util.Scanner;
public class CalculoFactorial {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular Factorial");
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();
        int factorial = 1;
        do {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
                System.out.print("["+ i +"]");
                System.out.print(" ");
            }
            System.out.println("El factorial es: " + factorial);
            
        } while (numero==0);
    }
}
