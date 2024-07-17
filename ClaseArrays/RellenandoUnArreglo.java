package ClaseArrays;

import java.util.Arrays;
import java.util.Scanner;
public class RellenandoUnArreglo {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Rellenando un arreglo");
        System.out.print("Ingresa el tamanio del arreglo: ");
        int tamanio = entrada.nextInt();
        System.out.print("Ingrese un numero para rellenarlo: ");
        int numero = entrada.nextInt();

        int[] array = new int[tamanio];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10) + 1);
            // System.out.print(array[i] + " ");            
        }
        System.out.println("El array generado es : " + Arrays.toString(array));
        Arrays.fill(array, numero);
        System.out.println("El array rellenado es : " + Arrays.toString(array));


    }

}
