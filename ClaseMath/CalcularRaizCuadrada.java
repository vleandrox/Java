package ClaseMath;
import java.util.Scanner;
public class CalcularRaizCuadrada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular Raiz Cuadrada");
        System.out.print("Ingresa un numero: ");
        int num = entrada.nextInt();
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));
    }
    
}
