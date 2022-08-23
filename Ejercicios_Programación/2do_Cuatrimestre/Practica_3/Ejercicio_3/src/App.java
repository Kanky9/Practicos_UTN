/*
    Crear dos arrays de nxn y sumar sus valores, los resultados se deben almacenar en
otro array. Los valores y la longitud serán insertados por el usuario. Mostrar los arrays
originales y el resultado.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int array1[][], fila, columna, suma = 0;

            System.out.println("Ingresa un número de filas");
            fila = leer.nextInt();
            System.out.println("Ingresa un número de columnas");
            columna = leer.nextInt();

            array1 = new int[fila][columna];

            System.out.println("Ingrese los números de la matriz");
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    System.out.print("matriz [" + i + "]" + "[" + j + "]: ");
                    array1[i][j] = leer.nextInt();
                    suma = suma + array1[i][j];
                }
            }

            for (int k = 0; k < array1.length; k++) {
                for (int h = 0; h < array1[k].length; h++) {
                    System.out.print(array1[k][h] + "  ");
                }
                System.out.println(" ");
            }
            int[] array2 = { suma };
            System.out.println("La suma de los valores es: " + array2[0]);
        }
    }
}