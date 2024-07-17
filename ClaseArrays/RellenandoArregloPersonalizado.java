package ClaseArrays;
import java.util.Arrays;
import java.util.Scanner;
public class RellenandoArregloPersonalizado {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Rellenando arreglo personalizada");
        System.out.print("Ingresa el tamanio del arreglo: ");
        int tamanio = entrada.nextInt();       
        int[] array = new int[tamanio];        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10) + 1);
            // System.out.print(array[i] + " ");            
        }
        System.out.println("El array generado es : " + Arrays.toString(array));        
        int numero;
        int inicial=0;
        do {
            System.out.print("Ingresa un numero para rellenar el array: ");
            numero = entrada.nextInt();        
            System.out.print("Ingrese el indice inicial: ");
            inicial = entrada.nextInt();
            if(inicial<=array.length){
                Arrays.fill(array, inicial, array.length, numero);
            }else{
                System.out.println("Error! El índice inicial debe ser menor que el tamanio del array");
            }            
        } while (inicial == array[array.length-1] || inicial>=array.length);        
        System.out.print("El array rellenado es desde el indice " +  Arrays.toString(array));        
    }
}
