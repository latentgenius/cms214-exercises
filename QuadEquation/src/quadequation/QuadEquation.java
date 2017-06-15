//File: QuadEquation.java

package quadequation;

/**
 * Solves a quadratic equation for an instance of the class
 * @author Jonathan Barisere
 */
public class QuadEquation {
    public QuadEquation(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            setDiscriminant();
            setRoots();
            setComment();
        }
    
    public final void setDiscriminant() {
        double temp = (b * b) - 4 * a * c;
        this.discriminant = Math.sqrt(temp);
    }
    
    public final void setRoots() {
        if(discriminant < 0) {
            
        }
        x1 = (-b + discriminant) / (2 * a);
        x2 = (-b - discriminant) / (2 * a);
    }
    
    public final void setComment() {
        if (discriminant == 0) {
            comment = "Comment:\n"
                    + "x1 equals x2:\n"
                    + "Real and equal roots";
        }
        else if (discriminant > 0) {
            comment  = "Comment:\n"
                    + "Real and distinct roots!";
        }
        else {
            comment = "Comment:\n"
                    + "Real and Imaginary roots";
        }
    }
    
    public double getX1() {
        return this.x1;
    }
    
    public double getX2() {
        return this.x2;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    private final int a, b, c;
    private double x1, x2, discriminant;
    String comment;
    
}
