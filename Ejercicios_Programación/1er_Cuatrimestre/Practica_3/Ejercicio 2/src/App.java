//Práctica 3, ejercicio 2: while

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Elija el número que desee multiplicar");
        int num1 = x.nextInt();
        System.out.println("Del 1 al 10, hasta que tabla quiere multiplicar el número ingresado anteriormente?");
        int num2 = x.nextInt();
        System.out.println("Los resultados son:");
        
        int c = 1;
        while (c <= num2) {
            int mult = num1 * c;
            System.out.println(num1 + " * " + c + " = " + mult);
            c = c + 1;
        }
        x.close();
    }
}
