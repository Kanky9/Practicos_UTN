//Ejercicio 1: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int num;

            do {
                System.out.println("Ingresar un número entre el 0 y el 999 ");
                num = leer.nextInt();

                if (num >= 1 & num <= 9) {
                    System.out.println("El número que ingreso tiene 1 dígito\n");
                }
                else if (num >= 10 & num <= 99) {
                    System.out.println("El número que ingreso tiene 2 dígitos\n");
                }
                else if (num >= 100 & num <= 999) {
                    System.out.println("El número que ingreso tiene 3 dígitos\n");
                }
            }
            while (num != 0);
            System.out.println("El número que ingreso es cero, fin del programa");
        }
    }
}