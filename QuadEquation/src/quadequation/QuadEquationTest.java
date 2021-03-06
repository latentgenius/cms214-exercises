// Driver program for the QuadEquation class
/**
 * @author Jonathan Barisere
 */

package quadequation;

import javax.swing.JOptionPane;

public class QuadEquationTest {
    public static void main(String[] args) {
        String a, b, c, comment;
        int varA, varB, varC;
        double x1, x2;
        
        JOptionPane.showMessageDialog(null, "Welcome to my Quadratic "
                + "Equation Solver");
        
        a = JOptionPane.showInputDialog(null, "Enter the value for a "
                + "(the coefficient of x^2)");
        b = JOptionPane.showInputDialog(null, "Enter the value for  "
                + "(the coefficient of x)");
        c = JOptionPane.showInputDialog(null, "Enter the value for c "
                + "(the constant term)");
        
        varA = Integer.parseInt(a);
        varB = Integer.parseInt(b);
        varC = Integer.parseInt(c);
        
        QuadEquation equation = new QuadEquation(varA, varB, varC);

        x1 = equation.getX1();
        x2 = equation.getX2();
        comment = equation.getComment();

        JOptionPane.showMessageDialog(null, "The roots of the equation are\n"
                                      + "x1 = " + x1 + "\nx2 = " + x2
                                      + "\nComment: " + comment, "Solution",
                                      JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
        
    }
    
}
