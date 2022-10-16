/*
    ¿Cuál es el resultado del siguiente programa?
*/

public class App {
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202); /*Devuelve true */
        boolean flag2 = isFrabjuous(202);/*Devuelve true */
        System.out.println(flag1);/*Muestra el resultado del boolean (true) */
        System.out.println(flag2);/* Muestra el resultado del boolean (true) */
        if (flag1 && flag2) { /*Si tanto flag1 como flag2 son true muestra ping por pantalla */
            System.out.println("ping!");
        }
        if (flag1 || flag2) { /*Si al menos uno de los boolean es true muestra pong por pantalla */
            System.out.println("pong!");
        }
    }

    public static boolean isHoopy(
            int x) { /*Si el valor de x dividido por 2 da como resto 0 entronces retorna true, si no retorna false */
        boolean hoopyFlag;
        if (x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }

    public static boolean isFrabjuous(int x) { /*Si el valor de x es mayor a 0 retorna true, si no retorna false */
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
}
/*
 * El resultado del código es?
true
true
ping!
pong!
 */