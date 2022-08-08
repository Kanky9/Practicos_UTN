//Ejercicio 4: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Cada día de la semana tiene un número que lo representa: \n 1 es lunes \n 2 es martes \n 3 es miercoles \n 4 es jueves \n 5 es viernes \n 6 es sábado \n 7 es domingo");

        System.out.println("Escriba el número del día elegido");
        int dia = leer.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El día que elegiste es Lunes");
                break;
            case 2:
                System.out.println("El día que elegiste es Martes");
                break;
            case 3:
                System.out.println("El día que elegiste es Miércoles");
                break;
            case 4:
                System.out.println("El día que elegiste es Jueves");
                break;
            case 5:
                System.out.println("El día que elegiste es Viernes");
                break;
            case 6:
                System.out.println("El día que elegiste es Sábado");
                break;
            case 7:
                System.out.println("El día que elegiste es Domingo");
                break;
            default:
                System.out.println("El número ingresado no pertenece a ningún día de la semana, vuelve a intentarlo");
        }
        leer.close(); 
    }
}