/*
    Crea un programa que pida por
pantalla cuatro países y a continuación tres ciudades de cada uno de estos
países. Los nombres de ciudades deben almacenarse en un array multidimensional
cuyo primer índice sea el número asignado a cada país y el segundo índice el
número asignado a cada ciudad.
*/

import java.util.Scanner; 

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String[][] paises = new String[4][1];
            paises[0][0] = "1";
            paises[1][0] = "2";
            paises[2][0] = "3";
            paises[3][0] = "4";
              
            String[][] ciudades = new String[4][3];
            ciudades[0][0] = "10";
            ciudades[0][1] = "11";
            ciudades[0][2] = "12";

            ciudades[1][0] = "20";
            ciudades[1][1] = "21";
            ciudades[1][2] = "22";

            ciudades[2][0] = "30";
            ciudades[2][1] = "31";
            ciudades[2][2] = "32";

            ciudades[3][0] = "40";
            ciudades[3][1] = "41";
            ciudades[3][2] = "42";

            System.out.println("Ingrese cuatro países");
            
            for (int i = 0; i < paises.length; i++) {
                System.out.println("Ingrese un país para asignarlo al número " + paises[i][0]);
                paises[i][0] = leer.nextLine();
            }

            System.out.println("\nIngrese tres Ciudades ");
            for (int j = 0; j < ciudades.length; j++) {
                for (int k = 0; k < ciudades[j].length; k++) {
                    System.out.println("Inrgese una ciudad para asignarla al número " + ciudades[j][k]);
                    ciudades[j][k] = leer.nextLine();
                }
            }

            for (int h = 0; h < ciudades.length; h++) {
                System.out.println("País: " + paises[h][0] + "| Ciudades: " + ciudades[h][0] + ", " + ciudades[h][1] + ", " + ciudades[h][2]);
            }
        }
    }
}