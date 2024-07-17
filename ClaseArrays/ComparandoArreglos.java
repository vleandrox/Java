package ClaseArrays;

import java.util.Arrays;

public class ComparandoArreglos {

    public static void main(String[] args) {

        System.out.println("Comparando Arrays");
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,3,4,5,6};
        int[] array3 = {1,2,3,4,5};
        System.out.println("El array 1 : " + Arrays.toString(array1));
        System.out.println("El array 2 : " + Arrays.toString(array2));
        System.out.println("El array 3 : " + Arrays.toString(array3));
        System.out.println("<<<<<---COMPARANDO--->>>>>>");
        
        System.out.println("<<<<< ARRAY 1 == ARRAY 2  >>>>>>");
        if(Arrays.equals(array1, array2)){
            System.out.println("Los arrays son iguales");
        }
        else{
            System.out.println("Los arrays no son iguales");
        }

        System.out.println("<<<<< ARRAY 1 == ARRAY 3  >>>>>>");
        if(Arrays.equals(array1, array3)){
            System.out.println("Los arrays son iguales");
        }
        else{
            System.out.println("Los arrays no son iguales");
        }

    }
    
}

