/*
    Crear una aplicación java de consola que contenga lo siguiente:
1. Diseñe un método en el que se pida ingresar por teclado su género (M o F).
2. Luego solicitar su nombre que le corresponde a un varón o mujer.
3. Imprimir por consola los datos ingresados por el usuario.
*/

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        ingresarGenero();
    }

    public static void ingresarGenero() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese su género \nM = masculino \nF = femenino \n");
            String genero = leer.nextLine();

            System.out.println("Ahora ingrese su nombre");
            String nombre = leer.nextLine();

            if (genero.equals("M")) {
                genero = "Masculino";
            }
            else if (genero.equals("F")) {
                genero = "Femenino";
            }

            System.out.println("\nGénero: " + genero + "\nNombre: " + nombre);
        }
    }
}