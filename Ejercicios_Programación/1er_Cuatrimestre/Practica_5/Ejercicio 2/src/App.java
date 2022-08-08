//Ejercicio 2:

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresa a continuación diaz números para sumarlos entre sí");
            int c = 1;
            int suma = 0;
            
            do {
                System.out.println(c + ")Número");
                int num = leer.nextInt();
                System.out.println("La suma de " + suma + " + "  + num + " = ");
                suma = suma + num;
                System.out.println(suma);
                c = c + 1;
                
            }
            while (c <= 10);
            System.out.println("La suma de todos los números da como resultado: " + suma);
        }
    }
}
