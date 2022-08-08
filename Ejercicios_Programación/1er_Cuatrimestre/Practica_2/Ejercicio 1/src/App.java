//Practica 2, ejercicio 1: A y B

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);

        int A;
        int B;
        
        System.out.println("Ingrese un número para A");
        A = num.nextInt();
        System.out.println("Ingrese un número para B");
        B = num.nextInt();

        System.out.println("A vale: " + (A = B));

        System.out.println("Vuelve a asignarle un valor a A");
        A = num.nextInt();
        
        System.out.println("B vale: " + (B = A));

        num.close();
    }
}
