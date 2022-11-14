/*
    Crear una aplicación java de consola que contenga lo siguiente: un método que simule el
proceso de subir a un piso en un ascensor, donde el número de piso es ingresado por teclado.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ascensor();
    }
    
    public static void ascensor() {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Seleccione a que piso quiere ir \n1 es planta baja \n2 es primer piso \n3 es segundo piso \n4 es tercer piso \n");
            

             boolean bucle = true;

             do {
                int piso = leer.nextInt();
                
                switch (piso) {
                    case 1:
                        System.out.println("Yendo a planta baja");
                        break;

                    case 2:
                        System.out.println("Yendo a primer piso");
                        break;

                    case 3:
                        System.out.println("Yendo a segundo piso");
                        break;

                        case 4:
                        System.out.println("Yendo a tercer piso");
                        break;

                    default:
                        System.out.println("Ese valor no existe, ingrese otro por favor");
                        bucle = false; 
                }
            } while (bucle == false);
        } 
    }
}