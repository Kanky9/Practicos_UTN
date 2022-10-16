/*
    Para cada método, escribir una oración que describa lo que hace el método, sin entrar en detalles
sobre cómo funciona. Para cada variable, identificar el papel que juega.
*/

public class App {
    public static void main(String[] args) {

    }
    /*El método banana recibe array de enteros por parámetros, inicializa dos variables enteras, recorre con un bucle while mientras que el valor de i sea menor al array a se va a multiplicar el valor de kiwi con el valor de a, y se guardará en kiwi, para que cambie el valor de i se le suma 1 en cada vuelta. El método retorna la multiplicación de todos los valores del array a. */
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    /*El método grapefruit recibe un array de números a y una variable int llamada grape, genera un for el cual se ejecuta mientras i sea menor al array a, sumandose de uno en uno. Dentro de el hay un if el cual retorna el valor de i mientras el elemento que tengo en determinado lugar de a sea igual a grape. return -1 termina el código */
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    /*El método pineapple recibe un array int llamado a y un int llamado apple, crea un int llamado pear y lo inicializa en 0, genera un bucle for mejorado y le asigna los valores de a a la variable pine, dentro de este bucle hay un if el cual le incrementa el valor a pear en 1 si pine es igual a apple. Luego retorna el valor de pear */
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine : a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
}