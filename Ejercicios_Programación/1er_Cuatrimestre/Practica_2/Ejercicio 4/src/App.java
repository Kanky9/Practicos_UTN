//Practica 2, ejercicio 4: mayor

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Ingresa un número");
        num1 = num.nextInt();
        System.out.println("Ingresa otro número");
        num2 = num.nextInt();
        System.out.println("Ingrese otro número");
        num3 = num.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es mayor a " + num2 + " y a " + num3);
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es mayor a " + num1 + " y a " + num3);
        }

        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " es mayor a " + num1 + " y a " + num2);
        }

        num.close();
    }
}
