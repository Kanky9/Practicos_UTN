/*
    Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada
uno de estos países. Los nombres de ciudades deben almacenarse en un array multidimensional
cuyo primer índice sea el número asignado a cada país y el segundo índice el número asignado
a cada ciudad.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String[][] lugares = new String[4][3];
            String[] paises = new String[4];

            System.out.println("Ingrese el nombre de cuatro paises");
            for (int i = 0; i < lugares.length; i++) {
                System.out.println("País " + (i + 1) + ")");
                lugares[i][0] = leer.nextLine();
                paises[i] = lugares[i][0];

            }
            
            for (int j = 0; j < lugares.length; j++) {
                System.out.println("Ingrese el nombre de tres ciudades de " + lugares[j][0]);
                for (int k = 0; k < lugares[j].length; k++) {
                    System.out.println("Ciudad " + (k + 1));
                    lugares[j][k] = leer.nextLine();
                }
            }

            for (int h = 0; h < lugares.length; h++) {
                System.out.println("Pais: " + paises[h] + "| Ciudades: " + lugares[h][0] + ", " + lugares[h][1] +    ",  " + lugares[h][2]);
            }
        }
    }
}