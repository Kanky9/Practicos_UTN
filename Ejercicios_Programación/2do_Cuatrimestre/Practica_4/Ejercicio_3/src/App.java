/*
    Crear una aplicación de consola, crear un Array de números, rellenar el array de
números (int) usando el método fill de Arrays.
a. Crear otro Array de números, copiar los elementos del otro usando CopyOf de
Arrays.
*/

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int[] num = new int[5];
        
            System.out.println("Ingrese un número entero para completar el array");
            int completar = leer.nextInt();

            Arrays.fill(num, completar);

            System.out.println("Valores del array num:");
            for (int i : num) {
                System.out.println(i);
            }
            
            int[] num2 = Arrays.copyOf(num, num.length);

            System.out.println("\nValores del Array num2 copiados de num:");
            for (int j : num2) {
                System.out.println(j);
            }
        }
    }
}
