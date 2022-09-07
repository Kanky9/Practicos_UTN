/*
    Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Luego,
pedir al usuario posiciones del array por teclado y si la posición es correcta, se añadirá
a una cadena que se mostrara al final, se dejará de insertar en esa cadena cuando se
introduzca un -1 para la posición. Por ejemplo, si escribo los siguientes números
0 //Añadira la ‘A’ a la cadena
5 //Añadira la ‘F’ a la cadena
25 //Añadira la ‘Z’ a la cadena
50 //Error, inserte otro número
-1 //fin
Cadena resultante: AFZ
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            char[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
            String cadena = "";
            int posicion;
            
            System.out.println("Ingrese posiciones para crear una cadena de texto, cuando ya no quiera poner una   posición ingrese -1 para finalizar");
            
            int i = 1;
            do {
                System.out.println("posición " + i + ")");
                posicion = leer.nextInt();
                i += 1;

                if (posicion <= 27 && posicion >= 1) {
                    cadena += caracteres[posicion - 1];
                }
                else if (posicion >= 27 || posicion <= 1){
                    System.out.println("El número ingresado es incorrecto, vuelva a ingresar uno");
                    i -= 1;
                }
            }
            while (posicion != -1);
            System.out.println("Fin \nCadena resultante: " + cadena);
        }
    }
}