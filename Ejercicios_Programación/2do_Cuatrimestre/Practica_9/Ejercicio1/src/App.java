/*
    Crear una aplicación java de consola que contenga lo siguiente:
1. Crear un método para mostrar la tabla de multiplicar de cualquier número ingresado
por teclado.
*/

import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresar un número para multiplicar");
            int num1 = leer.nextInt();

            System.out.println("Por qué tabla desea multiplicar el número " + num1);
            int tabla = leer.nextInt();
        
        
            multiplicar(num1, tabla);
        }
    }
    
    public static void multiplicar(int num1, int tabla) {

        int mult = num1 * tabla;
        
        System.out.println("El resultado de: " + num1 + " * " + tabla + " = " + mult);
    }
}
