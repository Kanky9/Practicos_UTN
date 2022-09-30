/*
Desarrollar una aplicación java de consola, crear un array de 10 posiciones de números con valores
pedidos por teclado. Mostrar por consola el índice y el valor al que corresponde. Haz dos métodos,
uno para rellenar valores y otro para mostrar.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num[] = new int[10];

        rellenar(num);
        System.out.println("");
        mostrar(num);
    }

    public static void rellenar(int lista[]) {
        try (Scanner leer = new Scanner(System.in)) {
            for (int i = 0; i < lista.length; i++) {
                System.out.println("Introduce un número");
                lista[i] = leer.nextInt();
            }
        }
    }

    public static void mostrar(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}