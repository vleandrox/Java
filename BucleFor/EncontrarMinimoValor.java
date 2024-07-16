package BucleFor;

public class EncontrarMinimoValor {

    public static void main(String[] args) {
        
        int[] arrays = {9,5,3,2,8,7,5};
        int minimo = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] < minimo){
                minimo = arrays[i];
                
            }                        
        }
        System.out.println("El minimo valor del array es: "+minimo);

    }
    
}
