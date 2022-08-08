/*1. Crear un array de números y otro de String de 10 posiciones cada uno.
2. Solicitar al usuario que ingrese las notas entre 0 y 10. Se debe controlar que inserte
una nota valida, pudiendo ser decimal la nota en el array de números. Guardar las
notas en el array.
3. Solicitar al usuario que ingrese los nombres de los alumnos. Guardar en el array de
Strings los nombres de los alumnos ingresados.
4. Luego mostrar por pantalla cada alumno, su nota y resultado. Se debe considerar para
el resultado las siguientes validaciones:
a. Si la nota esta entre 0 y 5,99 el resultado será “No aprobado”.
b. Si la nota esta entre 6 y 6,99 el resultado será “Aprobado bueno”.
c. Si la nota esta entre 7 y 8,99 el resultado será “Notable”.
d. Si la nota esta entre 9 y 10 el resultado será “Sobresaliente”. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            double[] nota = new double[10];
            String[] nombre = new String[10];

            for (int j = 0; j < nombre.length; j++) {
                System.out.println("Nombre del alumno: ");
                nombre[j] = leer.nextLine();
            }

            for (int i = 0; i < nota.length; i++) {
                System.out.println("Nota de " + nombre[i] + ":");
                nota[i] = leer.nextDouble();

                while (nota[i] < 0 || nota[i] > 10) {
                    System.out.println("La nota ingresada no es válida, vuelva a escribirla");
                    nota[i] = leer.nextDouble();
                }
            }

            System.out.println("Lista de notas finales: \n");
            for (int h = 0; h < nota.length; h++) {
                if (nota[h] >= 0 && nota[h] <= 5.99) {
                    System.out.println(nombre[h] + ": No aprobado \n");
                } else if (nota[h] >= 6 && nota[h] <= 6.99) {
                    System.out.println(nombre[h] + ": Aprobado/bueno \n");
                } else if (nota[h] >= 7 && nota[h] <= 8.99) {
                    System.out.println(nombre[h] + ": Notable \n");
                } else if (nota[h] >= 9 && nota[h] <= 10) {
                    System.out.println(nombre[h] + ": Sobresaliente \n");
                }
            }
        }
    }
}

/* No me deja pedir dos veces el nombre del alumno cuando esta en el mismo for que la nota (a la nota si me la pide las veces necesarias).
 * for (int i = 0; i < nota.length; i++) {
 *      System.out.println("Nombre del alumno: ");
 *      nombre[i] = leer.nextLine();
 *      System.out.println("Nota de " + nombre[i] + ":");
 *      nota[i] = leer.nextDouble();
 * 
 *      while (nota[i] < 0 || nota[i] > 10) {
 *          System.out.println("La nota ingresada no es válida, vuelva a escribirla");
 *          nota[i] = leer.nextDouble();
 *      }
 * }
 */