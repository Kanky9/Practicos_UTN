//Práctica 4, ejercicio 1: Centígrados a Fahrenheit

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escribir cuántos grados Centígrados quiere pasar a Fahrenheit");
        double gradosC = leer.nextInt();
        double gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC + " grados Centígrados equivalen a " + gradosF + " grados Fahrenheit");

        leer.close();
    }
}
