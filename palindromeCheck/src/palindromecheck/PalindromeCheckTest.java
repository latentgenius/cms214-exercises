package palindromecheck;

import java.util.Scanner;

/**
 * Exercise 3 driver program
 * @author Jonathan Barisere
 */
public class PalindromeCheckTest {
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
