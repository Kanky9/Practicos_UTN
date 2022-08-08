
/*Ejercicio 1:
    Crear un programa que solicite al usuario que ingrese el nombre de una fruta y esta se
    repita 10 veces.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre de una fruta");
            String fruta = leer.nextLine();
            
            int i = 1;
            while (i < 10) {
                System.out.println(fruta);
                i = i + 1;
            }
        }
    }
}