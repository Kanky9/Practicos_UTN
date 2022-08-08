/*Ejercicio 4: 
    Programa Java que muestre los números del 100 al 1 utilizando la instrucción while.
    Realiza el mismo ejercicio utilizando la instrucción do..while y otro utilizando la
    instrucción for. ¿Cuál de las tres estructuras consideras más eficiente para la
    resolución del ejercicio?
*/

public class App {
    public static void main(String[] args) {

        int num = 100;

        System.out.println("Resultado en while:");
        while (num >= 1) {
            System.out.println(num);
            num -= 1;
        }

        int num2 = 100;

        System.out.println("Resultado en do while:");
        do {
            System.out.println(num2);
            num2 -= 1;
        } while (num2 >= 1);

        System.out.println("Resultado en for");
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
/*
 * ¿Cuál de las tres estructuras consideras más eficiente para la
   resolución del ejercicio?
 * La estructura for, es más facil y rápido dar la instrucción de arranque, fin y suma en una misma linea. también más cómodo para leer
 */
