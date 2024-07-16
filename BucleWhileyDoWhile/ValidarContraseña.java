package BucleWhileyDoWhile;

public class ValidarContraseña {

    public static void main(String[] args) {
        System.out.println("Acceso al sistema de forma segura");        
        String password = "secreto";
        while (!password.equals("password")) {
            System.out.print("Ingresa tu password: ");
            password = System.console().readLine();                      
        }
        System.out.println("Acceso Concedido");
    }    
}
