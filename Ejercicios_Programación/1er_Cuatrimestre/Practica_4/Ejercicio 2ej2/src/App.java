//Práctica 4, ejercicio 2: 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Crea un usuario");
            String user = leer.nextLine();
            System.out.println("Crea una contraseña");
            String contra = leer.nextLine();
            System.out.println("Ahora vuelve a escribir tu contraseña para validar tus datos");
            String contraseña;

            do {
                System.out.println("Esciba su contraseña");
                contraseña = leer.nextLine();
                
                if (contraseña.equals(contra)) {
                    System.out.println("Tu contraseña es incorrecta");
                    System.out.println("Ingrese la contraseña correcta");
                }
            }
            while (contra != contraseña);
            System.out.println("Su contraseña es correcta y su usuario es " + user + ", ya puede ingresar a la página");
        }
    }
}
