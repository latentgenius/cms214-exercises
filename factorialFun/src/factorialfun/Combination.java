package factorialfun;

/**
 * Exercise 4
 * @author Jonathan Barisere
 */

public class Combination {
    public Combination(int n, int r) {
        setCombination(n, r);
    }
    
    private void setCombination(int n, int r) {
        int nFact = (new Factorial(n)).getFactorial();
        int nRFact = (new Factorial(n - r)).getFactorial();
        int rFact = (new Factorial(r)).getFactorial();
        
        this.nCr = nFact / (nRFact * rFact);
    }
    
    /**
     * 
     * @return nCr
     */
    public int getCombination() {
        return this.nCr;
    }
    
    private int nCr;
}
