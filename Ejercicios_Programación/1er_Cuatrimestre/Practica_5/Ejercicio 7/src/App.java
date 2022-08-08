//Ejercicio 7:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Elija el valór numérico de la nota que desee: \n4 o menor = Suspenso \n5 = Suficiente \n6 = Bien \n7 = Notable bajo \n8 = notable alto \n9 = sobresaliente \n10 = Matrícula de honor \nMayor a 10 = Nota superior");
        System.out.println("Elija el número");
        int num = leer.nextInt(); 
         
        switch (num) {
            case 5:
                System.out.println("Nota: suficiente");
                break;
            case 6:
                System.out.println("Nota: bien");
                break;
            case 7:
                System.out.println("Nota: notable bajo");
                break;
            case 8:
                System.out.println("Nota: notable alto");
                break;
            case 9:
                System.out.println("Nota: sobresaliente");
                break;
            case 10:
                System.out.println("Nota: matrícula de honor");
                break;
            default:
                if (num <= 4) {
                    System.out.println("nota: suspenso");
                }
                else if (num >= 11) {
                    System.out.println("Nota: nota superior");
                }
        }
        leer.close();
    }
}
