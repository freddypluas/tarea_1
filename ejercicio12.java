
package app;
import java.util.Scanner;

public class ejercicio12 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int año;
         System.out.println("Ingresa dia:");
          dia = sc.nextInt();
          System.out.println("Ingresa mes: ");
           mes = sc.nextInt();
        System.out.println("Ingresa año: ");
        año = sc.nextInt();
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("El año " + año + " Si es bisiesto ");
        } else {
            System.out.println("El año " + año + " No es bisiesto ");
        }
    }
    
}
