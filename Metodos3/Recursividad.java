package Metodos3;

public class Recursividad {
 
    public static void main(String[] args) {
        Integer numero = 20;
        System.out.print("La suma de los primeros " + numero + "numeros naturales es : ");
        System.out.println(sumarNumerosNaturales(numero));
        System.out.print("La suma de los primeros " + numero + "numeros naturales es : ");
        System.out.println(sumarNumerosNaturalesRecursivo(numero));
    }

    public static Integer sumarNumerosNaturales(Integer numero) {
        Integer suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static Integer sumarNumerosNaturalesRecursivo(Integer numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + sumarNumerosNaturalesRecursivo(numero - 1);
        }
    }
}
