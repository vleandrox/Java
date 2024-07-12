package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class CopiandoElementos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Copiando elementos");
        int valor1 = (int) ((Math.random()*10)+1);
        int valor2 = (int) ((Math.random()*10)+1);
        int valor3 = (int) ((Math.random()*10)+1);
        int[] array = {valor1,valor2,valor3};
        System.out.println("Los valores del array son: " + array[0] + " " + array[1] + " " + array[2]);
        int[] array2 = Arrays.copyOf(array, 5);
        System.out.print("Ingresa el cuarto valor : ");
        array2[3] = entrada.nextInt();
        System.out.print("Ingresa el quinto valor : ");
        array2[4] = entrada.nextInt();        
        // System.arraycopy(array, 0, array2, 0, 3);
        System.out.println("Los valores del nuevo array son: " + array2[0] + " " + array2[1] + " " + array2[2] + " " + array2[3] + " " + array2[4]);
        int[] arrayunificado = {array[0],array[1],array[2],array2[3],array2[4]};
        System.out.println("Los valores del arrayunificado son: " + arrayunificado[0] + " " + arrayunificado[1] + " " + arrayunificado[2] + " " + arrayunificado[3] + " " + arrayunificado[4]);


    }
}
