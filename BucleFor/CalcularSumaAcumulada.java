package BucleFor;

public class CalcularSumaAcumulada {

    public static void main(String[] args) {

        System.out.println("Suma acumulada de los primeros 10 elementos");
        int[] arrays = {1,3,5,7,9};
        
        for (int i = 0; i < arrays.length; i++) {
            int suma = 0;
            for (int j = 0; j <= i; j++) {
                suma += arrays[j];
            }
            System.out.println("La suma de los primeros " + (i + 1) + " elementos es: " + suma);
        }
        System.out.println("Fin");
    }
}
