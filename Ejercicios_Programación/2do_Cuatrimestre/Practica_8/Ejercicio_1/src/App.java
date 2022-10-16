/*
 Crear una aplicación java de consola que contengan lo siguientes:
1. Crear un método que solicite datos personales a los usuarios ejemplo: nombre,
apellido y la edad, y sean ingresado por teclado.
2. Crear otro método que imprima los datos de una persona ingresados por teclado e
indicar si es mayor o menor de edad.
3. Crear otro método que almacene los datos ingresados por el usuario en un array,
puede ser unidimensional y por cada usuario se puede guardar la info concatenada,
ejemplo nombre + apellido + edad.
4. Crear un método que imprima la lista final de usuarios ingresados.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        datos();
    }

    public static void datos() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("ingrese la cantidad de usuarios totales");
            int cantidad = leer.nextInt();
            int[] edad = new int[cantidad];
            String[] names = new String[cantidad];
            String[] surnames = new String[cantidad];

            for (int i = 0; i < cantidad; i++) {
                names[i] = leer.nextLine(); /* Sin esta línea de código el siguiente Scanner no lo toma */
                System.out.println("ingrese nombre del " + (i+1) + "° usuario");
                names[i] = leer.nextLine();
                System.out.println("ingrese apellido");
                surnames[i] = leer.nextLine();
                System.out.println("ingrese edad");
                edad[i] = leer.nextInt();
            }
            imprimir(names, surnames, edad);
            System.out.println("");
            concatenados(names, surnames);
        }
    }

    public static void imprimir(String[] names, String[] surnames, int[] age) {
        for (int i = 0; i < age.length; i++) {
            System.out.println("");
            System.out.println("Usuario " + (i+1) + "°:");
            System.out.println("Nombre: " + names[i]);
            System.out.println("Apellido: " + surnames[i]);
            System.out.println("la edad de " + names[i] + " " + surnames[i] + " es " + age[i]);
            if (age[i] < 18) {
                System.out.println(names[i] + " es menor de edad");
            } else if (age[i] >= 18) {
                System.out.println(names[i] + " es mayor de edad");
            }
        }
    }

    public static void concatenados(String[] names, String[] surnames) {
        System.out.println("\nLista final");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + surnames[i]);
        }
    }
}