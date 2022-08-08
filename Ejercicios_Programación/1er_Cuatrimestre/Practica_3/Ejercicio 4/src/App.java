//Práctica 3, ejercicio 4: for

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            
            float c = 4;
            int suma = 0;
            int i;
            System.out.println("A continuación tendrá que escribir cuatro números para sacar un promedio");

            for (i = 1; i <= c; i++) {
                    System.out.println("Ingrese el " + i + ") número");
                    int num = leer.nextInt();
                    suma = suma + num;
            }
                System.out.println("El resultado del promedio es: " + suma / c);
        }
    }
}
