/*
Crear un array de números de un tamaño pasado por teclado, el array solicitar al
usuario que ingrese los valores que contendrá el array, por último, calcular cual es el mayor de
todos. Mostrar resultados por pantalla.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresar el tamaño del array");
            int tamaño = leer.nextInt();

            int[] myArray = new int[tamaño];
            int num_mayor = 0;
            int j = 1;

            for (int i : myArray) {
                System.out.println("Ingresar el número del array[" + j +"]");
                i = leer.nextInt();
                if (i > num_mayor) {
                    num_mayor = i;
                }
                j += 1;
            }
            System.out.println("El número mayor del array es: " + num_mayor);
        }
    }
}
