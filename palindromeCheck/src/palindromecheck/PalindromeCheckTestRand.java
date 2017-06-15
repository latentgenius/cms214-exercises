/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

import java.util.Random;

/**
 *
 * @author jonathanks
 */
public class PalindromeCheckTestRand {
    public static void main(String[] args) {
        
        PalindromeCheck checker;
        Random randInt = new Random();
        int randomInteger = 100 + randInt.nextInt() % 1000;
        int palCount = 0;
        int notPalCount = 0;
        
        for(int i = 0; i < 1000; i++) {
            int newInt = 100 + randInt.nextInt() % 1000;
            checker = new PalindromeCheck(String.valueOf(newInt));
            
            if (checker.isPalindrome()) ++palCount;
            else ++notPalCount;
        }
        
        System.out.println("Number of palindromes found: " + palCount);
    }
}
