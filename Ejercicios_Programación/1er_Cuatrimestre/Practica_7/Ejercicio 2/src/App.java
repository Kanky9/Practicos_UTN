/*Ejercicio 2:
    Mostrar los números sucesivos hasta 20, de un numero ingresado por teclado, cabe
    indicar que el numero debe ser menor de 20.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresa un número menor al 20");
            int num = leer.nextInt();
            System.out.println("Los números sucesivos del número ingresado hasta el veinte son:");

            while (num <= 20) {
                System.out.println(num);
                num = num + 1;
            }
        }

    }
}
