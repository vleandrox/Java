package ClaseMath;
import java.util.Scanner;

public class CalcularValorAbsoluto {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular valor absoluto");
        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();
        System.out.print("El valor absoluto es: " + Math.abs(numero));
    }
}
