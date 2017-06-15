/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialfun;

import java.util.Scanner;

/**
 *
 * @author jonathanks
 */
public class FactorialFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kbdInput = new Scanner(System.in);
        int n, r;
        
        System.out.println("Factorial");
        System.out.print("n: ");
        n = kbdInput.nextInt();
        
        System.out.println("" + n + "! = " + (new Factorial(n)).getFactorial());
        
        System.out.println("Permutation");
        
        System.out.print("n: ");
        n = kbdInput.nextInt();
        
        System.out.print("r: ");
        r = kbdInput.nextInt();
        
        System.out.println("" + n + "P" + r + " = " +
                (new Permutation(n, r)).getPermutation());
        
        System.out.println("Combination");
        
        System.out.print("n: ");
        n = kbdInput.nextInt();
        
        System.out.print("r: ");
        r = kbdInput.nextInt();
        
        System.out.println("" + n + "C" + r + " = " +
                (new Combination(n, r)).getCombination());
        
        System.exit(0);
    }
    
}
