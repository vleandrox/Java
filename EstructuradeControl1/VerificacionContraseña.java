package EstructuradeControl1;

import java.util.Scanner;
public class VerificacionContraseña {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Verificando contraseña");
        System.out.print("Ingresa tu password: ");
        String password = entrada.nextLine();
        if( password.equals("password")){
            System.out.println("Acceso Concedido");
        }else{
            System.out.println("Acceso denegado");
        } 
    }
}
