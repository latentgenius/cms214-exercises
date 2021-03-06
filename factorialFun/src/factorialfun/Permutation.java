/**
 * Exercise 4c
 * @author Jonathan Barisere
 */

package factorialfun;

public class Permutation {
    public Permutation(int n, int r) {
        setPermutation(n, r);
    }
    private void setPermutation(int n, int r) {
        int nFact = (new Factorial(n)).getFactorial();
        int nRFact = (new Factorial(n - r)).getFactorial();
        
        this.nPr = nFact / nRFact;
    }
    
    public int getPermutation() {
        return this.nPr;
    }
    
    private int nPr;
}
