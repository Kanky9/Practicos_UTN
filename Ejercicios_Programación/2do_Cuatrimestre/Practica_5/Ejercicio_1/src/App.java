/*
     Crear dos Arrays de String,
rellenar los arrays con datos solicitados al usuario. Indica si los dos arrays
creados y completados son iguales utilizando el método Equals de Arrays.
*/

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String[] array_1 = new String[1];
            String[] array_2 = new String[1];

            System.out.println("Ingrese datos de tipo texto al primer array");
            for (int i = 0; i < array_1.length; i++) {
                array_1[i] = leer.nextLine();
            }

            System.out.println("Ingrese datos de tipo texto al segundo array");
            for (int j = 0; j < array_1.length; j++) {
                array_2[j] = leer.nextLine();
            }

            for (int k = 0; k < array_1.length; k++) {
                if (Arrays.equals(array_1, array_2)) {
                    System.out.println("El primer array es igual al segundo \nDatos del primer array: " + array_1[k]
                        + "\nDatos del segundo arary: " + array_2[k]);
                }
                else {
                    System.out.println("El primer array es diferente al segundo\nDatos del primer array: " + array_1[k] + "\nDatos del segundo arary: " + array_2[k] );
                }
            }
        }
    }
}
