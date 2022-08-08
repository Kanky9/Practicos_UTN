//Ejercicio 3: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int edad;
            int vueltas = 0; 
            int suma = 0;
            int prom;
            do {
                System.out.println("Ingrese su edad");
                edad = leer.nextInt();
                suma = suma + edad;
                vueltas = vueltas + 1;
                prom = suma / vueltas;
            }
            while (prom <= 25);
            System.out.println("El promedio de las edades es igual: " + prom + ", como supero el número 25, finaliza el programa");
        }
    }
}