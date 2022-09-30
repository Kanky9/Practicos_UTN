/*
    Revisa el flujo de ejecución a través de un programa con múltiples métodos.
Lee el siguiente código y responde las preguntas.
*/

public class App {
    public static class Buzz {
        public static void baffle(String blimp) { /*7 */
            System.out.println(blimp);/*8, se imprime el valor que contiene blimp */
            zippo("ping ", -5); /*9, se ejecuta zippo nuevamente, pero con distintos parámetros */
        }

        public static void zippo(String quince, int flag) { /*2 y 10 */
            if (flag < 0) { /*3 false, 11 true */
                System.out.println(quince + " zoop ");
            } 
            else { /*4 */
                System.out.println("ik "); /*5 */

                baffle(quince); /*6, se invoca al método baffle */
                System.out.println("boo-wa-ha-ha "); /*13 */
            }
        }

        public static void main(String[] args) {
            zippo("rattle ", 13); /*1, primer línea ejecutada, invoca al mpetodo zippo */
        }
    }
}

/*
 * 1. Escribir el número 1 al lado de la primera línea de código en este
 * programa que se ejecutará.
 * 2. Escribir el número 2 al lado de la segunda línea de código, y así sucesivamente hasta el final del programa. Si una línea se ejecuta más de una vez, podría terminar con más de un número al lado.
 * 3. ¿Cuál es el valor del parámetro blimp cuando se invoca el baffle?
    El valor de blimp es el valor que contiene quince, osea rattle.
 * 4. ¿Cuál es el resultado de este programa?
  ik
  rattle
  pingzoop
  boo-wa-ha-ha
 */