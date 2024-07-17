package ClaseArrays;

import java.util.Scanner;
import java.util.Arrays;

public class CopiarParteDeUnArreglo {

    public static void main(String[] args) {
        System.out.println("<<<<<<<  COPIANDO PARTE DE UN ARRAY >>>>>>>");
        Scanner entrada = new Scanner(System.in);
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int inicial, final1;        
        do {
            System.out.print("Ingresa el índice inicial: ");
            inicial = entrada.nextInt();

            System.out.print("Ingresa el índice final: ");
            final1 = entrada.nextInt();

            if (inicial >= final1) {
                System.out.println("Error! El índice inicial debe ser menor que el índice final.");
            } else if (inicial < 0 || final1 > array.length) {
                System.out.println("Error! Los índices deben estar dentro de los límites del array (0 a " + (array.length - 1) + ").");
            }
        } while (inicial >= final1 || inicial < 0 || final1 > array.length);
        int[] arrayCortado = Arrays.copyOfRange(array, inicial, final1);
        System.out.println("El array copiado es: " + Arrays.toString(arrayCortado));

        // System.out.print("Ingresa el indice inicial: ");
        // int inicial =  entrada.nextInt();
        // System.out.print("Ingresa el indice final: ");
        // int final1 = entrada.nextInt();                
        // if(inicial<final1){
        //     if(inicial < array.length && final1 <= array.length){
        //         int[] arraycortado = Arrays.copyOfRange(array, inicial, final1);
        //         System.out.print(Arrays.toString(arraycortado));
        //     }else{
        //         System.out.print("Error! Los indices no estan dentro de los limites del array");    
        //     }                        
        // }else{
        //     System.out.print("Error! El indice inicial es mayor al indice final ");
        // }
    }
}
