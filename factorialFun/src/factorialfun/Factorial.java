/**
 * Exercise 4a
 * @author Jonathan Barisere
 */
package factorialfun;

public class Factorial {
    public Factorial(int n) {
        
        this.setFactorial(n);
        
    }
    
    private void setFactorial(int n) {
        
        int nFact = 1;
        
        if (n == 0 || n == 1) 
            this.nFactorial = 1;
        else {
            for (int i = n; i > 1; --i)
                nFact *= i;
        }
        this.nFactorial = nFact;
    }
    
    /**
     * 
     * @return nPr
     */
    public int getFactorial() {
        return nFactorial;
    }
    
    private int nFactorial;
}
