//Ejercicio 2: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int n;
            int num1 = 0;
            int num2 = 0;
            do {
                System.out.println("Ingrese la nota del alumno");
                n = leer.nextInt();
                if (n > 0 && n < 7) {
                    num1 = num1 + 1;
                }
                else if (n >= 7 && n <= 10) {
                    num2 = num2 + 1;
                }
            }
            while (n != 0);
            System.out.println("Alumnos con notas menores a 7 son: " + num1);
            System.out.println("Alumnos con notas mayores o iguales a 7 son: " + num2);
        }
    }
}
