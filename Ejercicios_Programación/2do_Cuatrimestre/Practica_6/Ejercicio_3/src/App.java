/*
    Dado tres palos, podemos o no organizarlos en un triángulo.
Por ejemplo, si uno de los palos tiene 12 pulgadas de largo y los otros dos tienen una pulgada de
largo, no podrás hacer que los palos cortos se encuentren en el medio. Para cualquiera de las tres
longitudes, hay una prueba simple para ver si es posible formar un triángulo:
Si cualquiera de las tres longitudes es mayor que la suma de las otras dos, no puede formar un
triángulo.
Escribir un método llamado isTriangle que tome tres enteros como argumentos y devuelva
verdadero o falso, dependiendo de si puede o no formar un triángulo a partir de palos con las longitudes dadas. El objetivo de este ejercicio es usar enunciados condicionales para escribir un
método de valor.
*/

import java.util.Scanner;

public class App {
    public static void isTriangle(int palo1, int palo2, int palo3) {
        int num1 = palo1;
        int num2 = palo2;
        int num3 = palo3;
        
        if ((num1 + num2) >= num3) {
            System.out.println("true, el triángulo se puede formar");
        }
        else{
            System.out.println("false, el triangulo no se puede formar");
        }
    }

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del primer palo");
            int p1 = leer.nextInt();

            System.out.println("Ingrese el valor del segundo palo");
            int p2 = leer.nextInt();

            System.out.println("Ingrese el valor del tercer palo");
            int p3 = leer.nextInt();

            isTriangle(p1, p2, p3);
        }
    }
}