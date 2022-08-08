//Pracrica 1: ejercicio 3: bancos, alumnos

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese la cantidad de bancos");
        Scanner banc = new Scanner(System.in);
        int bancos = banc.nextInt();
        System.out.println("Escribe la cantidad de alumnos");
        int alumnos = banc.nextInt();
        int resto = alumnos - bancos;

        if (alumnos <= bancos) {
            System.out.println("No hacen faltan bancos");
        } 
        else {
            System.out.println("Faltan " + resto + " bancos");
        }
        banc.close();
    }
}
