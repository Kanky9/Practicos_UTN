/*
    Crear una aplicación de consola que solicite al usuario que ingrese por teclado una
frase. Pasar los caracteres de esa frase a un array de caracteres. Para ello podrás
utilizar métodos de la clase String.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresa una frase");
            String frase = leer.nextLine();

            char[] salida = frase.toCharArray();

            System.out.println("La frase elegida es: " + frase + "\nPasado a char:");

            for (char j : salida) {
                System.out.println(j);
            }
        }
    }
}