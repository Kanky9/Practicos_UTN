//Ejercicio 5: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresa a continuación diez números para sumarlos entre sí");
            int c = 1;
            int suma = 0;
            int sneg = 0;
            int spos = 0;
            
            do{
                System.out.println(c + ")Número");
                int num = leer.nextInt();
                suma = suma + num;
                c = c + 1;

                if (num < 0) {
                    sneg = sneg + num;
                }
                else {
                    spos = spos + num;
                }  
            }
            while (c <= 10);
            System.out.println("La suma de los números negativos da como resultado: " + sneg);
            System.out.println("La suma de los números positivos da como resultado: " + spos);
            System.out.println("La suma de todos los números da como resultado: " + suma);
        }
    }
}
