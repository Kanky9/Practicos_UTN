/*
    Crear un array de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como
aparece en la matriz.
*/

public class App {
    public static void main(String[] args) {
        int[][] myarray = { { 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 8, 9 }};
 
        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i][0] + ", " + myarray[i][1] + ", " + myarray[i][2]);
        }
    }
}
