//Ejercicio 1: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {

            System.out.println("Ingresa a continuación el primer número");

            int n1, n2;
            do {
                System.out.println("Primer número:");
                n1 = leer.nextInt();
                System.out.println("Segundo número:");
                n2 = leer.nextInt();
                
                if (n1 != n2) {
                    System.out.println("Los números no son iguales, ingresalos nuevamente");
                }
            } while (n1 != n2);
            System.out.println("Muy bien, los numeros son iguales");
        }
    }
}
