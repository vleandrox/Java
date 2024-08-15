package Debugger;

public class DepurarBucleFor {
    
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int suma = 0;
        System.out.println("Sumando elementos del array");
        for (int i = 0; i < array.length; i++) {
            suma= suma + array[i];
            System.out.println("La suma acumulada de los elementos del array en la posicion " + array[i]+"  es :" +suma);
        }
        System.out.println("La suma total de los elementos del array es: " + suma);
    }

}
