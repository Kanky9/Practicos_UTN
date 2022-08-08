/*Ejercicio 5
    Un programa que pregunte año, mes y día y que me imprima en que semana y el día
    de la semana correspondiente.
*/

import java.util.Scanner; 
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {

            int año, mes, dia;
        
            boolean valido = false;

            do {
                System.out.println("Ingresar el número del mes deseado (Entre 1 y 12) ");
                mes = leer.nextInt();

                if (mes > 0 && mes < 13) {
                    valido = true;
                }
            } while (!valido);

            do {
                System.out.println("Ingresar el día (Entre 1 y 7)");
                dia = leer.nextInt();

                if (mes == 2 && dia <= 29) {
                    valido = true;
                }
                else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                    valido = true;
                }
                else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 
                        || mes == 12) && dia <= 31) {
                    valido = true;
                }
                if (dia > 0) {
                    valido = true;
                } 
            } while (!valido);

            do {
                System.out.println("Ingresar el año");
                año = leer.nextInt();

                if ((año == 1582 && (mes > 10 || (mes == 10 && dia > 14)))|| año >= 1582 ) {
                    valido = true;    
                }
            } while (!valido);


            TimeZone timezone = TimeZone.getDefault();
            Calendar calendar = new GregorianCalendar(timezone);
            calendar.set(año, mes - 1, dia);
            int diaSem = calendar.get(Calendar.DAY_OF_WEEK);
            
            String lDia = "";
            switch (diaSem) {
                case 1:
                    lDia = "Domingo";
                    break;
                case 2:
                    lDia = "Lunes";
                    break;
                case 3:
                    lDia = "Martes";
                    break;
                case 4:
                    lDia = "Miércoles";
                    break;
                case 5:
                    lDia = "Jueves";
                    break;
                case 6:
                    lDia = "Viernes";
                    break;
                case 7:
                    lDia = "Sábado";
                    break;
            }

            String nomMes = ""; 
            switch (mes) {
                case 1:
                    nomMes = "Enero";
                    break;
                case 2:
                    nomMes = "Febrero";
                    break;
                case 3:
                    nomMes = "Marzo";
                    break;
                case 4:
                    nomMes = "Abril";
                    break;
                case 5:
                    nomMes = "Mayo";
                    break;
                case 6:
                    nomMes = "Junio";
                    break;
                case 7:
                    nomMes = "Julio";
                    break;
                case 8:
                    nomMes = "Agosto";
                    break;
                case 9:
                    nomMes = "Septiembre";
                    break;
                case 10:
                    nomMes = "Octubre";
                    break;
                case 11:
                    nomMes = "Noviembre";
                    break;
                case 12:
                    nomMes = "Disciembre";
                    break;
            }
            
            int semAño = calendar.get(Calendar.WEEK_OF_YEAR);


            System.out.println("Semana del año: " + semAño + ", Dia: " + lDia + " " + dia + " de " + nomMes + " del " + año);
        }
    }
}