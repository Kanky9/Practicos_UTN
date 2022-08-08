//Practica 2, ejercicio 3: >, <, ==

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);       

        int num1;
        int num2;
        
        System.out.println("Ingrese un número");
        num1 = num.nextInt(); 
        System.out.println("Ingresa otro número");
        num2 = num.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor a " + num2);
        }
        if (num1 < num2){
            System.out.println(num1 + " es menor a " + num2);
        }
        if (num1 == num2) {
            System.out.println(num1 + " es igual a " + num2);
        }
        num.close();
    }
}
