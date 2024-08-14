package ActividadIntegradora3;

import java.util.Arrays;
import java.util.Scanner;

public class EstadisticasDeCalificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Estadisticas de calificaciones ");
        System.out.print("Ingresa cuantas calificaciones quieres en el Arreglo: ");
        int calif = entrada.nextInt();
        Double[] calificaciones = new Double[calif];
        for (int i = 0; i < calif; i++) {
            calificaciones[i] = (double) Math.floor(Math.random() * (20 - 1)) + 1;
        }
        System.out.println("Las calificaciones : " + Arrays.toString(calificaciones));

        Double[] desaprobados = new Double[calif];
        Double[] aprobados = new Double[calif];
        Double[] excelentes = new Double[calif];
        Double sumad = 0.0, sumaa = 0.0, sumae = 0.0;
        int countDesaprobados = 0, countAprobados = 0, countExcelentes = 0;
        for (int i = 0; i < calif; i++) {
            if (calificaciones[i] < 10) {
                desaprobados[countDesaprobados] = calificaciones[i];
                sumad += desaprobados[countDesaprobados];                
                countDesaprobados++;                            
            } else if (calificaciones[i] >= 11 && calificaciones[i] < 14) {
                aprobados[countAprobados] = calificaciones[i];
                sumaa += aprobados[countAprobados];
                countAprobados++;
            } else {
                excelentes[countExcelentes] = calificaciones[i];
                sumae += excelentes[countExcelentes];
                countExcelentes++;
            }
        }
        Double promedioDesaprobados = countDesaprobados > 0 ? sumad / countDesaprobados : 0.0;
        Double promedioAprobados = countAprobados > 0 ? sumaa / countAprobados : 0.0;
        Double promedioExcelentes = countExcelentes > 0 ? sumae / countExcelentes : 0.0;
        System.out.println("Las Sumas Notas : " + " D:" + sumad + ", A:" + sumaa + ", E:" + sumae);
        System.out.println(
                "Las calificaciones desaprobados : " + Arrays.toString(Arrays.copyOf(desaprobados, countDesaprobados))
                        + " con un promedio de : " + promedioDesaprobados);
        System.out.println("Las calificaciones aprobados : " + Arrays.toString(Arrays.copyOf(aprobados, countAprobados))
                + " con un promedio de : "
                + promedioAprobados);
        System.out.println("Las calificaciones excelentes : "
                + Arrays.toString(Arrays.copyOf(excelentes, countExcelentes)) + " con un promedio de : "
                + promedioExcelentes);

        entrada.close();

    }

}
