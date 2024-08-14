package Metodos2;

public class ImprimirArray {
    
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        String[] texto = {"uno","dos","tres","cuatro","cinco"};
        imprimirArray(array);
        imprimirArray(array, texto);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {    
            System.out.print(" " +array[i]+" ");
        }
    }
    public static void imprimirArray(int[] array,String[] texto) {
        for (int i = 0; i < array.length; i++) {    
            System.out.print(texto[i]+" - "+array[i] +" ");
        }
    }

}
