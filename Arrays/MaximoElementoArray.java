package Arrays;

import java.util.Scanner;
public class MaximoElementoArray {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Promediando elementos");
        System.out.print("Ingresa el primer valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        int valor2 = entrada.nextInt();
        System.out.print("Ingresa el tercer valor: ");
        int valor3 = entrada.nextInt();
        System.out.print("Ingresa el cuarto valor: ");
        int valor4 = entrada.nextInt();
        System.out.print("Ingresa el quinto valor: ");
        int valor5 = entrada.nextInt();
        int[] array = {valor1,valor2,valor3,valor4,valor5};
        System.out.println("El los valores del array son: " + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);                
        int maximo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        System.out.println("El maximo valor del array es :  "+ maximo);
    }
}
