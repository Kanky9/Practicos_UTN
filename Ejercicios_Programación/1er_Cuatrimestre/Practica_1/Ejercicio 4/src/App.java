//Practica 1, ejercicio 4: descuento

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner descuento = new Scanner(System.in);
        
        System.out.println("Ingresar el monto total del pago");
        int monto = descuento.nextInt();
        System.out.println("Ingresar forma de pago");

        Scanner pagar = new Scanner(System.in);
        String pago = pagar.nextLine();

        int porsentaje = monto * 10 / 100;

        if (pago.equals("contado")) {
            System.out.println("Se aplicó un descuento del 10%, su total a pagar es: $" + (monto - porcentaje));
        } else {
            System.out.println("Su método de pago no posee el descuento");
        }
        descuento.close();
        pagar.close();
    }
}
