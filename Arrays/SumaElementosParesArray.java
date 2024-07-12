package Arrays;

public class SumaElementosParesArray {
    
    public static void main(String[] args) {

        System.out.println("Suma del elemento 0,2,4 del array ");
        int valor1 = (int) ((Math.random() * 10) + 1);
        int valor2 = (int) ((Math.random() * 10) + 1);
        int valor3 = (int) ((Math.random() * 10) + 1);
        int valor4 = (int) ((Math.random() * 10) + 1);
        int valor5 = (int) ((Math.random() * 10) + 1);
        int[] array = { valor1, valor2, valor3, valor4, valor5 };
        System.out.println("Los valores del array son: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                suma += array[i];
            }
        }
        System.out.println("La suma del elemento 0,2,4 del array: " + suma);
    }
}
