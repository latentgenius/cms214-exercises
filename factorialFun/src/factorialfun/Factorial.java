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
public class Factorial {
    public Factorial(int n) {
        
        this.setFactorial(n);
        
    }
    /**
     * @param n is a natural number argument
     * @return an integer n!
     */
    
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
    
    public int getFactorial() {
        return nFactorial;
    }
    
    private int nFactorial;
}
