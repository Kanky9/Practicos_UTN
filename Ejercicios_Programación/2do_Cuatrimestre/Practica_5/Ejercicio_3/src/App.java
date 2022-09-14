/*
    Crear un Arrays de String que
contendrá los nombres de los alumnos de 1º año TUP. Solicitar al usuario que
ingrese los nombres de los alumnos.


Realizar un ordenamiento
alfabético ascendente, mostrar los resultados. Luego realiza un ordenamiento
descendente.


Solicitar al usuario que ingrese
un nombre de alumno a buscar. Realiza una búsqueda en el Arrays, si encuentras
coincidencia muestra por pantalla el índice (la ubicación) y el nombre del
alumno. Si no encuentras coincidencia deja un mensaje de aviso.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de alumnos que tiene el 1° año TUP");
            int cantidad = leer.nextInt();
            String[] alumnos = new String[cantidad];

            alumnos[0] = leer.nextLine(); /*Esta linea no se ejecuta, la puse para que el Scanner del siguiente for   si lo haga*/
            
            System.out.println("Ingrese los nombres de los alumnos de 1° año TUP");
            for (int i = 0; i < alumnos.length; i++) {
                alumnos[i] = leer.nextLine();
            }
            System.out.println("Los nombres de los alumnos ya fueron guardados.");

            Arrays.sort(alumnos, Comparator.reverseOrder()); /* Orden descendente */

            System.out.println("\nOrden alfabético descendente:");
            for (int i = 0; i < alumnos.length; i++) {
                System.out.println(alumnos[i]);
            }

            Arrays.sort(alumnos); /* Orden ascendente */

            System.out.println("\nOrden alfabético ascendente:");
            for (int i = 0; i < alumnos.length; i++) {
                System.out.println(alumnos[i]);
            }
 
            System.out.println("Escriba el nombre de un alumno para buscarlo en la lista");
            boolean salir = true;

            do{
                String buscar = leer.nextLine();
                for (int j = 0; j < alumnos.length; j++) {
                    if (alumnos[j].equalsIgnoreCase(buscar)) {
                        System.out.println("Hay coincidencia, el alumno es " + alumnos[j]
                                + " y se encuentra en la posición (" + (j + 1) + ")");
                        salir = false;
                    }
                }
                if (salir == true) {
                    System.out.println("No se encontraron coincidencias, vuelva a buscar un alumno");
                }
            }
            while (salir == true);
        }
    }
}