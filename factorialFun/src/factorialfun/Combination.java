/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialfun;

/**
 *
 * @author jonathanks
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
    
    public int getCombination() {
        return this.nCr;
    }
    
    private int nCr;
}
