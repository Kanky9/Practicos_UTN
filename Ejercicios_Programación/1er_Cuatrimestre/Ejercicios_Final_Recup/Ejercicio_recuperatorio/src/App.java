/*
1. Crear un array de números de 5 posiciones.
2. Inicializar el array creado con los siguientes valores {1,2,3,4,5}.
3. Crear otro array de números.
4. Guardar los valores del primer array creado en el segundo array distinto, pero con los
valores invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
Utilizar la estructura for.
5. Mostrar por pantalla el contenido de los dos arrays.
*/

public class App {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = new int[5];
        int j = 1;
        int k = 0;

        for (int i = 4; i < array1.length; i--) {
            array2[k] = array1[i];

            System.out.println("Lugar " + j + " del primer array: " + array1[k]);
            System.out.println("Lugar " + j + " del segundo array: " + array2[k] + "\n");
            j += 1;
            k += 1;
        }
    }
}