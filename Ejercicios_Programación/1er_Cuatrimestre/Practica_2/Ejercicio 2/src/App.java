//Practica 2, ejercicio 2: +, -, *, /

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        Scanner let = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = num.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = num.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println("Elija que operación desea realizar");
        String op = let.nextLine();

        if (op.equals("sumar")) {
            System.out.println(num1 + " + " + num2 + " = " + suma);
        }
        if (op.equals("restar")) {
            System.out.println(num1 + " - " + num2 + " = " + resta);
        }
        if (op.equals("multiplicar")) {
            System.out.println(num1 + " * " + num2 + " = " + mul);
        }
        if (op.equals("dividir")) {
            System.out.println(num1 + " / " + num2 + " = " + div);
        }

        num.close();
        let.close();
    }
}
