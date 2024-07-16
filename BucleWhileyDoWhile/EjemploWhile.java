package BucleWhileyDoWhile;

public class EjemploWhile {

    public static void main(String[] args) {
        int numero = 2131231231;
        int cifras = 0;
        while (numero>0) {            
            numero = numero/10;
            cifras++;
        }
        System.out.println("El numero tiene " + cifras + " cifras");
    }
}
