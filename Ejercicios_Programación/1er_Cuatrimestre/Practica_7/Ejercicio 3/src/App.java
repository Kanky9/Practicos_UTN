/*Ejercicio 3:
    Calcular y visualizar la suma y el producto de los números pares comprendidos entre
    20 y 100.
*/

public class App {
    public static void main(String[] args) {
        
        int suma = 0;
        double prod = 1; 

        for (int i = 20; i <= 100; i += 2) {
            suma = suma + i;
            prod = prod * i;
        }
        System.out.println("La suma de todos los números contadores empezando del 20 al 100 da como resultado: " + suma);
        System.out.println("La multiplicación de todos los números contadores empezando del 20 al 100 da como resultado: " + prod);
    }
}
