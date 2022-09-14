/*
    Crear un Arrays de números,
solicitar al usuario los valores para completar los elementos del arrays. Ordena
el array de números utilizando el método Sort de Arrays.
*/

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresar el tamaño del array");
            int tamaño = leer.nextInt();

            int[] num = new int[tamaño];

            System.out.println("Ingrese números para rellenar el array");
            for (int i = 0; i < num.length; i++) {
                System.out.println("Número " + (i + 1) + ")");
                num[i] = leer.nextInt();
            }

            System.out.println("\nNúmeros ordenados:");
            Arrays.sort(num);
            for (int j : num) {
                System.out.println(j);
            }
        }
    }
}