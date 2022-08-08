//Practica 3, ejercicio 1: meses 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner mes = new Scanner(System.in);

        System.out.println(
                "Cada mes tiene un número que lo representa:                                                       \n 1 es Enero                                                                                         \n 2 es Febrero                                                                                       \n 3 es Marzo                                                                                         \n 4 es Abril                                                                                        \n 5 es Mayo                                                                                        \n 6 es Junio                                                                                       \n 7 es Julio                                                                                       \n 8 es Agosto                                                                                      \n 9 es Septiembre                                                                                  \n 10 es Octubre                                                                                    \n 11 es Noviembre                                                                                  \n 12 es Diciembre ");

        System.out.println("Escriba el número del mes elegido");
        int meses = mes.nextInt();

        switch (meses) {
            case 1:
                System.out.println("El mes que elegiste es Enero");
                break;
            case 2:
                System.out.println("El mes que elegiste es Febrero");
                break;
            case 3:
                System.out.println("El mes que elegiste es Marzo");
                break;
            case 4:
                System.out.println("El mes que elegiste es Abril");
                break;
            case 5:
                System.out.println("El mes que elegiste es Mayo");
                break;
            case 6:
                System.out.println("El mes que elegiste es Junio");
                break;
            case 7:
                System.out.println("El mes que elegiste es Julio");
                break;
            case 8:
                System.out.println("El mes que elegiste es Agosto");
                break;
            case 9:
                System.out.println("El mes que elegiste es Septiembre");
                break;
            case 10:
                System.out.println("El mes que elegiste es Octubre");
                break;
            case 11:
                System.out.println("El mes que elegiste es Noviembre");
                break;
            case 12:
                System.out.println("El mes que elegiste es Diciembre");
                break;
            default:
                System.out.println("El número ingresado no pertenece a ningún mes, vuelve a intentarlo");
        }
        mes.close();
    }
}
