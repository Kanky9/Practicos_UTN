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
            int k = frase.length();

            char[] salida = new char[k];

            for (int i = 0; i < salida.length; i++) {
                salida[i] = frase.charAt(i);
            }

            System.out.println("La frase elegida es: " + frase + "\nPasado a char:");

            for (char j : salida) {
                System.out.println(j);
            }
                
            
        }
    }
}