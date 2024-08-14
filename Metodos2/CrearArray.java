package Metodos2;

import java.util.Arrays;
import java.util.Scanner;

public class CrearArray {
    
    public static Scanner entrada = new Scanner(System.in);
    public static int tamanio = 0;
    public static int limiteInferior = 0;
    public static int limiteSuperior = 0;
    
    
    public static void main(String[] args) {   
        solicitarDatos();
        int[] array=generarArray();
        mostrarArray(array);
    }
    public static void solicitarDatos(){
        System.out.print("Ingresa el tamanio del array: ");
        tamanio = entrada.nextInt();
        System.out.print("Ingresa el limite inferior: ");
        limiteInferior = entrada.nextInt();
        System.out.print("Ingresa el limite superior: ");
        limiteSuperior = entrada.nextInt();
        return;
    }

    public static int[] generarArray(){
        int[] array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior);
        }
        return array;
    }

    public static void mostrarArray(int[] array){
        System.out.println("El array es: " + Arrays.toString(array));       
    }

}
