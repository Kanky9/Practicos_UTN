/*
Ejercicio 2 
– Diseñar un programa que calcula la suma total de una serie de números
ingresados por teclado. El programa deberá leer 10 números enteros y los debe guardar en un
array. Luego realizar la suma de todos los números y mostrar por pantalla el resultado final. 
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int[] num = new int[10];
            System.out.println("Ingrese diez números enteros para sumarlos entre sí");
            
            int suma = 0;
            int cont = 0; 
            for (int i = 0; i < num.length; i++) {
                System.out.println("num " + (cont+=1) + ")");
                num[i] = leer.nextInt();

                suma += num[i];
            }
            System.out.println("La suma de todos los números da como resultado:" + suma);
        }
    }
}
