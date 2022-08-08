/*
Ejercicio 1 – Array Booleano:
Diseñar un programa que recorra las butacas de una sala de cine y determine cuántas butacas
desocupadas hay en la sala. Suponga que inicialmente tiene un array con valores booleanos
que si es true (verdadero) implica que está ocupada y si es false (falso) la butaca está
desocupada. Tenga en cuenta que el array deberá ser creado e inicializado al principio del
algoritmo.
*/

public class App {
    public static void main(String[] args) {
        int butSobrantes = 0; 
        boolean[] butacas = new boolean[12]; 

        for (int f = 0; f < butacas.length ;f++){
            butacas[f] = (f % 2 == 0) ? true : false;
        }
        
        for (int i = 0; i < butacas.length; i++){
            if (butacas[i] == false) {
                butSobrantes += 1;
            }
        }
        System.out.println("En total sobran " + butSobrantes + " butacas");
    }
}