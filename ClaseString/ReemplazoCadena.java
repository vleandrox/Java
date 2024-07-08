package ClaseString;
import java.util.Scanner;

public class ReemplazoCadena {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Reemplazo de una cadena");
        System.out.print("Ingresa una palabra o frase: ");  
        String frase = entrada.nextLine();
        System.out.print("Ingresa 2 caracteres: ");  
        char caracteres = entrada.next().charAt(0);
        String reemplazo = frase.replace(caracteres, 'X');
        System.out.println(reemplazo);
    }
}
