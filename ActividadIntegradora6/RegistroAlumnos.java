package ActividadIntegradora6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroAlumnos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[0];
        Double[] notas = new Double[0];

        System.out.println("** Sistema de registro de Alumnos **");
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");

            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.print("Ingresa una opción: ");
                try {
                    opcion = entrada.nextInt();
                    if (opcion >= 1 && opcion <= 7) {
                        entradaValida = true;
                    } else {
                        System.out.println("Incorrecto, ingrese entre (1-7): ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor ingresa un número.");
                    entrada.next(); // Limpiar el buffer del scanner
                }
            }
            // do {
            // System.out.print("Ingresa una opción: ");
            // opcion = entrada.nextInt();
            // if((opcion > 7 || opcion < 1)) {
            // System.out.println("Incorrecto, ingrese entre (1-7): ");
            // }
            // System.out.println(opcion);
            // } while (opcion > 7 || opcion < 1);

            switch (opcion) {
                case 1: {
                    System.out.println("Selecionaste la opcion 1 : REGISTRAR ALUMNO");
                    System.out.print("Ingresa el nombre del alumno: ");
                    String nombre = entrada.next().toLowerCase();
                    System.out.print("Ingresa la nota : ");
                    Double nota = entrada.nextDouble();

                    nombres = Arrays.copyOf(nombres, nombres.length + 1);
                    notas = Arrays.copyOf(notas, notas.length + 1);

                    nombres[nombres.length - 1] = nombre;
                    notas[notas.length - 1] = nota;

                    System.out.println("Alumno registrado con éxito");
                    break;
                }
                case 2: {
                    System.out.println("Seleccionaste la opcion 2 : MOSTRAR ALUMNOS");
                    System.out.println("Alumnos registrados:");
                    for (int i = 0; i < nombres.length; i++) {
                        System.out.println("Nombre: " + nombres[i]);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Seleccionaste la opcion 3 : PROMEDIO DE NOTAS");
                    double suma = 0;
                    int contador = 0;
                    for (int i = 0; i < notas.length; i++) {
                        suma += notas[i];
                        contador++;
                    }
                    double promedio = suma / notas.length;
                    System.out.println("El promedio de notas es : " + promedio);
                    System.out.println("La cantidad de alumnos es : " + contador);
                    break;
                }
                case 4: {
                    System.out.println("Seleccionaste la opcion 4 : BUSCAR ALUMNO POR NOMBRE");
                    System.out.print("Ingresa el nombre del alumno: ");
                    String nombre = entrada.next().toLowerCase();
                    boolean encontrado = false;
                    for (int i = 0; i < nombres.length; i++) {
                        if (nombres[i].equals(nombre)) {
                            System.out.println("Nota: " + notas[i]);
                        } else {
                            if (!encontrado) {
                                System.out.println("Alumno no encontrado");
                                encontrado = true;
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Seleccionaste la opción 5 : MODIFICAR NOTA POR NOMBRE");
                    System.out.print("Ingresa el nombre del alumno: ");
                    String nombre = entrada.next().toLowerCase();
                    boolean encontrado = false;
                    for (int i = 0; i < nombres.length; i++) {
                        if (nombres[i].equals(nombre)) {
                            System.out.print("Ingresa la nueva nota : ");
                            Double nota = entrada.nextDouble();
                            notas[i] = nota;
                            System.out.println("Nota modificada");
                            System.out.println("Nombre: " + nombres[i] + "  Nota: " + notas[i]);
                        } else {
                            if (!encontrado) {
                                System.out.println("Alumno no encontrado");
                                encontrado = true;
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Seleccionaste la opcion 6 : ELIMINAR ALUMNO POR NOMBRE");
                    System.out.print("Ingresa el nombre del alumno: ");
                    String nombre = entrada.next().toLowerCase();
                    int posicion = -1;

                    for (int i = 0; i < nombres.length; i++) { // Primero busco la posicion del alumno
                        if (nombres[i].equals(nombre)) {
                            posicion = i;
                        }
                    }
                    System.out.print("La posicion del alumno es : " + posicion);

                    if (posicion != -1) {
                        String[] nuevoArray = new String[nombres.length - 1];
                        for (int i = 0, k = 0; i < nombres.length; i++) {
                            if (i == posicion) {
                                continue;
                            }
                            nuevoArray[k++] = nombres[i];
                        }
                        nombres = nuevoArray;
                        System.out.println("El alumno " + nombre + " ha sido eliminado.");

                    } else {
                        System.out.println("Alumno no encontrado");
                    }
                    // String[] nuevoArray = new String[nombres.length-1];
                    // System.arraycopy(nombres, 0, nuevoArray, 0, posicion);
                    // System.arraycopy(nombres, posicion + 1, nuevoArray, posicion, nombres.length
                    // - posicion - 1);
                    // for (int i = 0; i < nuevoArray.length; i++) {
                    // System.out.println("Nombre: " + nuevoArray[i]);
                    // }
                    break;
                }
                case 7: {
                    System.out.println("Seleccionaste la opción 7 : SALIR");
                    System.out.println("Gracias por usar el sistema");
                    break;
                }
            }
        }
    }
}
