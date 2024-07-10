package ClaseMath;

import java.util.Scanner;

public class NumeroAleatorioEntreLimites {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero aleatorio entre limites");
        System.out.print("Ingresa el limite inferior: ");
        int limiteInferior = entrada.nextInt();
        System.out.print("Ingresa el limite superior: ");
        int limiteSuperior = entrada.nextInt();

        System.out.println("Numero aleatorio entre : " + (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior)) + 1);
    }
}
