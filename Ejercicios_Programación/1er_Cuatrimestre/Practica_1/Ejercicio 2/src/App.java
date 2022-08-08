//Practica 1, ejercicio 2: loguearse

import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner log = new Scanner(System.in); 
        System.out.println("Cree su usuario");
        System.out.println("Escriba el usuario que desee");
        String user = log.nextLine();
        System.out.println("Escriba la contraseña que desee");
        String password = log.nextLine();
        System.out.println("Su cuenta ya fue registrada, ahora vuelva a ingresar para comprobar los datos"); 

        System.out.println("Ingresar usuario"); 
        String usuario = log.nextLine();
        System.out.println("Ingrese contraseña");
        String contraseña = log.nextLine();

        if (user.equals(usuario)) { 
            if (password.equals(contraseña)) {
                System.out.println("Sus datos son correctos, puede ingresar a la página");
            } else {
                System.out.println("Su contraseña es incorrecta");
            }
        }
        else {
            System.out.println("Su usuario es incorrecto");
        }
        log.close();
    }
}
