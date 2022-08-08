//Práctica 4, ejercicio 2: contraseña

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Cree un usuario");
            String user = leer.nextLine();
            System.out.println("Ahora cree una contraseña");
            String pass = leer.nextLine();
            System.out.println("Sus datos fueron guardados correctamente");
            System.out.println("vuelva a ingresar sus datos para poder ingresar a la página \nIngrese su usuario");
            String usuario = leer.nextLine();
            System.out.println("Ingrese su contraseña");
            String contra = leer.nextLine();

            if (user.equals(usuario)){
                if (pass.equals(contra)) {
                    System.out.println("Muy bien, su nombre de ususario es: " + user + ", ya puede ingresar a la página");
                }
                else {
                    System.out.println("Su contraseña es incorrecta, cámbiela por su seguridad \nIngrese su nueva contraseña:");
                    String new_contra = leer.nextLine();
                    System.out.println("Vuelve a ingresar la contraseña para verificar que es la correcta");
                    String verifi_contra = leer.nextLine();
                    if (new_contra.equals(verifi_contra)){
                        System.out.println("Muy bien, su nombre de ususario es: " + user + ", ya puede ingresar a la página");
                    }
                }
            }
            else {
                System.out.println("Su usuario es incorrecto, pero encontramos una coinsidencia: " + user + " es usted? \n Escribe si/no");
                String verifi_user = leer.nextLine();
                if (verifi_user.equals("si")) {
                    System.out.println("Ok, entonces ingrese su contraseña");
                    String contra2 = leer.nextLine();
                    if (pass.equals(contra2)) {
                        System.out.println("Muy bien, su nombre de ususario es: " + user + ", ya puede ingresar a la página");
                    } else {
                        System.out.println("Su contraseña es incorrecta, cámbiela por su seguridad \nIngrese su nueva contraseña:");
                        String new_contra = leer.nextLine();
                        System.out.println("Vuelve a ingresar la contraseña para verificar que es la correcta");
                        String verifi_contra = leer.nextLine();
                        if (new_contra.equals(verifi_contra)) {
                            System.out.println("Muy bien, su nombre de ususario es: " + user + ", ya puede ingresar a la página");
                        }
                    }
                }
                else {
                    System.out.println("Lo sentimos, no tenemos mas coinsidencias. Vuelve a intentarlo");
                }
            }
        }
    }
}
