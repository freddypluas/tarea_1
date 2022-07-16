
package app;

import java.util.Scanner;


public class ejercicio35 {

    public static void main(String[] args) {
      int horas ;
       int horas_extras;
       int leer_horas ;
       double  pago;
       double  leer_pago;
       double pago_extra;
       double sueldo;
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("ingrese las horas trabajadas" );
       horas = entrada.nextInt();
       
       System.out.print("ingresa el pago por hora" );
       pago = entrada.nextInt();
       
       if ( horas<=40 ){
            horas_extras = horas - 40 ;
            pago_extra = pago * 1.5;
             sueldo = (40*pago) + (horas_extras * pago_extra);
           
       }else {
           sueldo = horas * pago ;
       } 
       
       System.out.print("El sueldo por horas  "+horas +"tu sueldo es"+sueldo );
    }
    
}
