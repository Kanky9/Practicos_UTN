//Practica 2, ejercicio 5: producto, suma

import java.util.Scanner; 

public class App {
    public static void main(String[] args)  {
        System.out.println("Ingrese un número"); 
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = num.nextInt();
        System.out.println("Ingrese otro número");
        int num3 = num.nextInt();
        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;
        
        if (num1 < 0) {
            System.out.println("Resultado: " + producto);
        } else {
            System.out.println("Resultado: " + suma);
        }
        num.close();
    }
}
