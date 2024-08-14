package ActividadIntegradora3; 
import java.util.Scanner;
public class GenerarContraseña {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Generar contraseña aleatoria");
        System.out.print("Ingresa la longitud del password a generar: ");
        int longitud = entrada.nextInt();     
        char[] contraseña = new char[longitud];
        boolean contieneMayuscula;
        boolean contieneMinuscula;
        boolean contieneDigito;
        for (int i = 0; i < longitud; i++) {
            contraseña[i] = (char) (Math.random() * 94 + 33);
            System.out.print(contraseña[i]);            
        }    
        do {
            contieneMayuscula = false;
            contieneMinuscula = false;
            contieneDigito = false;
            for (int i = 0; i < contraseña.length; i++) {
                if (Character.isUpperCase(contraseña[i])) {
                    contieneMayuscula = true;
                } else if (Character.isLowerCase(contraseña[i])) {
                    contieneMinuscula = true;
                } else if (Character.isDigit(contraseña[i])) {
                    contieneDigito = true;
                }
            }
        } while (!contieneMayuscula || !contieneMinuscula || !contieneDigito);

        String contraseniaGenerada = new String(contraseña);
        System.out.println("La contraseña generada es: " + contraseniaGenerada);
        entrada.close();
    }
}
