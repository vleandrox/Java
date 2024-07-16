package BucleForEach;

public class ContandoElementosPares {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Sumando elementos pares");
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            int num = (int) ((Math.random() * 10) + 1);
            arrays[i] = num;
            // System.out.println("El elemento en la posicion " + i + " es: " + arrays[i]);
        }
        System.out.println("La suma acumulada de los arrays");
        int suma = 0;
        for (int i : arrays) {
            if (i % 2 == 0) {
                System.out.println("El elemento en la posicion " + i + " es: " + i);
                suma += i;
            }

        }
        System.out.println("La suma es: " + suma);

    }
}
