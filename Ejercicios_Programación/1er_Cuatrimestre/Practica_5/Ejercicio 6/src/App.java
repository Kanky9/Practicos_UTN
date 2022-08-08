//Ejercicio 6

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresa a continuación diez números para sumarlos entre sí");

            int suma = 0;
            int sneg = 0;
            int spos = 0;
            int i;

            for (i = 1; i <= 10; i++) {
                System.out.println(i + ")Número");
                int num = leer.nextInt();
                suma = suma + num;

                if (num < 0) {
                    sneg = sneg + num;
                }
                else {
                    spos = spos + num;
                }
            }
            System.out.println("La suma de todos los números negativos da como resultado: " + sneg);
            System.out.println("La suma de todos los números positivos da como resultado: " + spos);
            System.out.println("La suma de todos los números da como resultado: " + suma);
        }
    }
}
