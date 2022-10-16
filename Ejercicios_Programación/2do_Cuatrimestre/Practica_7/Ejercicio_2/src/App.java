/* ¿Cuál es el resultado del siguiente programa? Describir en pocas palabras lo que hace mus. */

public class App {

    /*El metodo make toma un int n, crea un array a, y el tamaño dependerá de la variable n, se genera un for y se recorre mientras i sea menor que n, se le suma 1 al lugar especificado del array a y se retornan los valores.*/
    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    /*El método dub toma un array de int llamado jub como parámetro, genera un for que se recorre mientras i sea menor al tamaño de jub, y le multiplica 2 por cada vuelta al cada valor del rray jub */
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }

    /* El método mus toma un array de int llamado zoo, crea un int fus y le asigna 0, genera un for que se ejecuta mientras i sea menor al tamaño de zoo y por cada vuelta le suma el valor de cada lugar de zoo y asigna los valores en fus, luego retorna el resultado de la suma total. */
    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }

    public static void main(String[] args) {
        /*Crea un array de int y le asigna el valor de make con el valor 5 en los parámetros (El cual se asigna a n), al método dub le da como parámetro bob, el cual es lo dicho anteriormente, luego se muestra por pantalla el método mus y como parámetro se le da bob, el cu'al contiene los valores del array make */
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }
}
/*El resultado es 30,  */