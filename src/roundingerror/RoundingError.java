/*
 * Jared Craig
 * 06/09/2018
 * Rounding Error
 */ 

package roundingerror;
import javax.swing.*;
/**
 *
 * @author jacra1226
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String numberStr = JOptionPane.showInputDialog("Input number");
        double numberDb =  Double.parseDouble(numberStr); 
           double numberSqrt = Math.pow(Math.sqrt(numberDb),2); 
          double numberDiff = numberSqrt - numberDb;

          System.out.println("The square of the square = " + numberSqrt);
          System.out.println("The round off error = " + numberDiff);
    }
    
}
