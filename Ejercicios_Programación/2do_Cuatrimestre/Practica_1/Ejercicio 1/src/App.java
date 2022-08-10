/*
Crea un array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el
valor de cada posición y la suma de todos los valores.
*/

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {

            Random aleatorio = new Random();
            int suma = 0; 

            System.out.println("Ingrese el tamaño del array");
            int tamaño = leer.nextInt();

            int[] myArray = new int[tamaño];
            int k = 1;

            for (int i : myArray) {
                i = aleatorio.nextInt(10);
                System.out.println("El número aleatorio entre 0 y 9 en la posición " + k + " del array es: " + i);
                k += 1;
                suma += i;
            }
            System.out.println("La suma total de los valores es: " + suma);
        }
    }
}