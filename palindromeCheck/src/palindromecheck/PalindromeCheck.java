package palindromecheck;

/**
 * Exercise 3
 * @author Jonathan Barisere
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
