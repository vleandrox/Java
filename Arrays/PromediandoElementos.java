package Arrays;
import java.util.Scanner;
public class PromediandoElementos {
    
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
        float[] array = {valor1,valor2,valor3,valor4};
        float promedio = (array[0] + array[1] + array[2] + array[3])/4;
        System.out.println("El promedio de los valores es: "+ promedio);

    }
}
