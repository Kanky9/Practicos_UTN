//Ejercicio 3: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresa a continuación diez números para sumarlos entre sí");
            
            int suma = 0;
            int i;
            
            for (i = 1; i <= 10; i++) {
                System.out.println(i + ")Número");
                int num = leer.nextInt();
                System.out.println("La suma de " + suma + " + " + num + " =");
                suma = suma + num;
                System.out.println(suma);
            }

            System.out.println("La suma de todos los números = " + suma);
        }
    }
}
