package ActividadIntegradora4;
import java.util.Scanner;
public class DibujandoCuadrados {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dibujando cuadrados");
        System.out.print("Ingresa el tamanio del cuadrado: ");
        int tamanio = entrada.nextInt();
        System.out.println("El cuadrado es: ");
        for(int i=0; i<tamanio; i++){
            for(int j=0; j<tamanio;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }    
    }
}
