/*
    Crear una aplicación java de consola para un supermercado, donde se hace un 20% de
descuento a los clientes cuya compra supere los $ 1.000 en las áreas de frutas, verduras y
abarrotes. ¿Cuál será el total que pagará una persona por su compra?, se debe mostrar el
nombre del cliente, producto, precio, cantidad, descuento y total a pagar.
Crear los métodos que consideres necesarios para la resolución de esta aplicación.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        comprar();
    }
    
    public static void datosCliente() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingresar el nombre del cliente");
            String nombre = leer.nextLine();

            System.out.println("\nNombre: " + nombre);
        }
    }

    public static void comprar() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println(
                "Hay un 20% de descuento en: frutas, verduras y abarrotes gastando más de $1000 \nIngrese el producto que desee comprar");
            
            String producto = leer.nextLine();

            System.out.println("Cuandos productos desea comprar?");
            Double cantidad = leer.nextDouble(); 

            System.out.println("Ingrese el monto individual del producto");
            Double monto = leer.nextDouble();
            Double total = monto * cantidad;
            Double descuento = 0.0;

            if (producto.equals("frutas") || producto.equals("verduras") || producto.equals("abarrotes")) {
                if (monto >= 1000) {
                    descuento = (total * 20) / 100;
                }
            }
            
            Double precioFinal = total - descuento;
            
            System.out.println("");
            datosCliente();
            System.out.println("Producto: " + producto);
            System.out.println("Precio inicial: $" + total);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Precio final: $" + precioFinal);
        }
    }
}