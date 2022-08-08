//Practica 1, ejercicio 1: sumar

import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        
        Scanner n = new Scanner(System.in); 
        
        System.out.println("Ingresa un número");
        int num1 = n.nextInt();
        System.out.println("Ingresa otro número");
        int num2 = n.nextInt();
        int suma;
        suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
    }
}
