package ActividadIntegradora4;
import java.util.Arrays;
import java.util.Scanner;
public class GraficoBarras {
    public static void main(String[] args) {    
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Grafico de barras");
        int[] numeros = new int [4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa los valores : ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Los valores son: " + Arrays.toString(numeros));        
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " : ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
