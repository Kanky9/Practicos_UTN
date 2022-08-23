/*
    Crear un array de 5 filas y n columnas. Se debe solicitar al usuario que ingrese el
número de columnas que desee que tenga su array. Completar el array con números
aleatorios entre 0 y 10.
*/

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args){
        try (Scanner leer = new Scanner(System.in)) {
            Random numRandom = new Random();

            System.out.println("Ingresar el tamaño de las columnas");
            int[][] myarray = new int[5][leer.nextInt()];
            
            for (int i = 0; i < myarray.length; i++) {
                for (int j = 0; j < myarray[i].length; j++) {
                    myarray[i][j] = numRandom.nextInt(11);
                    System.out.println(myarray[i][j]);
                }
            }
        }
    }
}