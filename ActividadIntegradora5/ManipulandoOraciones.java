package ActividadIntegradora5;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulandoOraciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Manipulando oraciones");
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Crear oración o Borrar oración");
            System.out.println("2. Cantidad de caracteres de la oración");
            System.out.println("3. Cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Salir");

            System.out.print("Ingresa una opción: ");
            opcion = entrada.nextInt();
            Scanner texto = new Scanner(System.in);
            switch (opcion) {
                case 1: {
                    System.out.println("Selecionaste la opcion 1");
                    System.out.println("Crear oración o Borrar oración");
                    System.out.print("Ingresa la oración: ");
                    String oracion = texto.nextLine();
                    if (oracion.isEmpty()) {
                        System.out.println("Crear oración");
                    } else {
                        System.out.println("Borrar oración");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Seleccionaste la opcion 2");
                    System.out.println("Cuantos caracteres tiene la oración");
                    System.out.print("Ingresa la oración: ");
                    String oracion = texto.nextLine();
                    System.out.println(oracion.length());
                    break;
                }
                case 3: {
                    System.out.println("Seleccionaste la opcion 3");
                    System.out.println("Cuantos letras tiene la oración");
                    System.out.print("Ingresa la oración: ");
                    String oracion = texto.nextLine();
                    int contador = 0;
                    for (int i = 0; i < oracion.length(); i++) {
                        if (Character.isLetter(oracion.charAt(i))) {
                            contador++;
                        }
                    }
                    System.out.println("Cantidad de letras de la oracion : " + contador);
                    break;
                }
                case 4: {
                    System.out.println("Seleccionaste la opcion 4");
                    System.out.println("Mostrar palabras ordenadas alfabéticamente");
                    System.out.print("Ingresa la oración: ");
                    String oracion = texto.nextLine().toUpperCase();
                    char[] palabras = oracion.toCharArray();
                    Arrays.sort(palabras);
                    System.out.println("Ordenado Alfabeticamente: " + Arrays.toString(palabras));
                    break;
                }
                case 5: {
                    System.out.println("Seleccionaste la opción 5");
                    System.out.print("Ingresa la oración: ");
                    String oracionParaPosicion = texto.nextLine();
                    String[] palabras = oracionParaPosicion.split(" ");

                    boolean posicionValida = false;
                    while (!posicionValida) {
                        System.out.print("Ingresa un número para obtener la palabra en esa posición: ");
                        int numero = texto.nextInt();
                        texto.nextLine(); // Para consumir la nueva línea después de nextInt()

                        if (numero > 0 && numero <= palabras.length) {
                            System.out.println("La palabra en la posición " + numero + " es: " + palabras[numero - 1]);
                            posicionValida = true;
                        } else {
                            System.out.println("Número inválido. Intente nuevamente.");
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Seleccionaste la opcion 6");
                    System.out.println("Buscar palabra dentro de la oración");
                    System.out.print("Ingresa la oración: ");
                    String oracion = texto.nextLine();
                    System.out.print("Ingresa un caracter a buscar: ");
                    char caracter = texto.next().charAt(0);
                    int busqueda = oracion.indexOf(caracter);
                    if (busqueda == -1) {
                        System.out.println("No se encontro el caracter");
                    } else {
                        System.out.println("Se encontro el caracter");
                        System.out.println("La posicion del caracter es: " + busqueda);
                    }
                    break;
                }
                case 7: {
                    System.out.println("Seleccionaste la opcion 7");
                    System.out.println("Modificar palabra dentro de la oración");
                    System.out.print("Ingresa la oración: ");
                    String oracion = texto.nextLine();                    
                    int posicion=0;

                    do {
                        System.out.print("Ingresa un caracter a buscar: ");
                        String caracter = texto.nextLine();
                        posicion = oracion.indexOf(caracter);   
                        if(posicion!=-1){
                            System.out.println("Se encontro el caracter"); 
                            System.out.print("Ingresa el nuevo caracter: ");
                            String nuevoCaracter = texto.nextLine();    
                            String oracionNueva = oracion.replace(caracter, nuevoCaracter);
                            System.out.println(oracionNueva);
                        }else{
                            System.out.println("No se encontro la palabra");
                        }
                    } while (posicion==-1);
                    break;
                }
                case 8: {
                    System.out.println("Seleccionaste la opcion 8");
                    System.out.println("Agregar contenido a la oración");
                    System.out.print("Ingresa la oración: ");
                    String oracion1 = texto.nextLine();
                    System.out.print("Ingresa el contenido: ");
                    String oracion2 = texto.nextLine();
                    System.out.println(oracion1 + " " + oracion2);
                    break;
                }
                case 9: {
                    System.out.println("Ha salido del programa !!!");
                    break;
                }
            }
        }
    }
}
