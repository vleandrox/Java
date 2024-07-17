package ClaseArrays;

import java.util.Arrays;

public class OrdernarArrayDescendente {
    
    public static void main(String[] args) {
        System.out.println("-----------------ORDENANDO ARRAYS ------------------------------");    
        // int[] enteros = {5,2,12,4,10,25,9,13}; 
        int[] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println("Los valores del array son: " + Arrays.toString(enteros));       
        Arrays.sort(enteros);
        System.out.println("Los valores del array ordenados son: " + Arrays.toString(enteros));
    }
}
