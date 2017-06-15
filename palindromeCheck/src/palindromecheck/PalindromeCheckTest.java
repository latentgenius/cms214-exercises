/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

import java.util.Scanner;

/**
 * Exercise 3 & 4 of CMS 214 homework
 * @author jonathanks
 */
public class PalindromeCheckTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbdInput = new Scanner(System.in);
        int input = kbdInput.nextInt();
        PalindromeCheck checker = new PalindromeCheck(String.valueOf(input));
        
        if (checker.isPalindrome()) {
            System.out.println("The number " + input + " is a palindrome");
        } else {
            System.out.println("The number " + input + " is a not palindrome");
        }
        
        System.exit(0);
    }
    
}
