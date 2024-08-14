package Metodos2;

import java.util.Scanner;

public class ValidacionPassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una contraseña");
        String password = scanner.next();

        if(esSegura(password)) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        }else {
            System.out.println("Contraseña no segura.");
            if(!verificarLongitud(password)) {
                System.out.println("Debe tener al menos 8 caracteres.");
            }
            if(!verificarMayuscula(password)){
                System.out.println("Debe contener al menos una letra mayúscula.");
            }
            if(!verificarMinuscula(password)){
                System.out.println("Debe contener al menos una letra minúscula.");
            }
            if(!verificarDigito(password)) {
                System.out.println("Debe contener al menos un número.");
            }
            if(!verificarCaracterEspecial(password)) {
                System.out.println("Debe contener al menos un carácter especial (por ejemplo, !, @, #, $, etc.).");
            }
        }
    }
    public static boolean esSegura(String password) {
        return verificarLongitud(password) &&
               verificarMayuscula(password) && 
               verificarMinuscula(password) && 
               verificarDigito(password) &&
               verificarCaracterEspecial(password);               
    }
    public static boolean verificarLongitud(String password) {
        return password.length() >= 8;
    }
    public static boolean verificarMayuscula(String password) {
        for (char c: password.toCharArray()) {
            if(Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean verificarMinuscula(String password) {
        for (char c: password.toCharArray()) {
            if(Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean verificarDigito(String password) {
        for (char c : password.toCharArray()) {
            if(Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean verificarCaracterEspecial(String password) {
        for(char c : password.toCharArray()){
            if(!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}