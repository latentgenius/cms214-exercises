/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

/**
 *
 * @author jonathanks
 */
public class PalindromeCheck {
    
    /**
     * @param text the string to check
     */
    public PalindromeCheck(String text) {
        this.text = (text != null) ? text : null;
    }
    
    /**
     * 
     * @return a boolean true if text is a palindrome, false otherwise
     */
    public boolean isPalindrome() {
        StringBuilder newText = new StringBuilder();
        if (text != null) {
            for (int i = text.length() - 1; i >= 0; i--) {
                newText.append(text.charAt(i));
            }
        }

        return (text != null) ? 
                text.equals(newText.toString())
                : false;
    }
    
    private final String text;
    
}
