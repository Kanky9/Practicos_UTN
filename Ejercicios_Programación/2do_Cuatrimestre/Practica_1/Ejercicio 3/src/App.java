/*
Crear un array de números de 100 posiciones, que contendrá los números del 1 al
100. Obtener la suma de todos ellos y la media. Mostrar resultados por pantalla.
*/

public class App {
    public static void main(String[] args) {
        int[] my_array = new int[100];
        int suma = 0;
        int media;

        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = i + 1;
            suma += my_array[i];
        }
        media = suma / 100;
        System.out.println("La suma de todos los números es: " + suma + "\nLa media de todos los números es: " + media);
    }
}