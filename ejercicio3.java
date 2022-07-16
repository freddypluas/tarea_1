
package app;
import javax.swing.JOptionPane;
public class ejercicio3 {

        public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int a = 200;
        int b = 5;
        int c = 6;
        x1 = (a + (b / c)) / ((a / b) + c);
        x2 = (a / (a + b)) / (a / (a - b));

        JOptionPane.showMessageDialog(null, "El resultado de la primera operacion es: " + x1
                + " \n El resultado de la seguda operacion es: " + x2);
    }
    
}
