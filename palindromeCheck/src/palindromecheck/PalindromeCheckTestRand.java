package palindromecheck;

import java.util.Random;

/**
 * Exercise 4
 * @author Jonathan Barisere 
 */
public class PalindromeCheckTestRand {
    public static void main(String[] args) {
        
        PalindromeCheck checker;
        Random randInt = new Random();
        
        // generate a random integer between 100 and 999 inclusive
        int randomInteger = 100 + randInt.nextInt() % 1000;
        int palCount = 0; // count found palindromes
        
        for(int i = 0; i < 1000; i++) {
            int newInt = 100 + randInt.nextInt() % 1000;
            checker = new PalindromeCheck(String.valueOf(newInt));
            
            if (checker.isPalindrome()) ++palCount;
            
        }
        
        System.out.println("Number of palindromes found: " + palCount);
    }
}
