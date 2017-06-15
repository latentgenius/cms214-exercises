/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseConvert;

/**
 *
 * @author jonathanks
 */
public class baseTenConvert {
    
    public baseTenConvert(int baseTenNo, int otherBase) {
        this.setBaseTenNumber(baseTenNo);
        this.setConvertedNumber(
                convertTo(baseTenNo, otherBase));
    }
    
    public final String convertTo(int baseTenNo, int otherBase) {
        int rem;
        int quotient = baseTenNo;
        StringBuilder remString = new StringBuilder();
        do {
            rem = (quotient % otherBase);
            quotient = quotient / otherBase;
            
            if(otherBase > 10 && rem > 9) {
                remString.append(Character.valueOf((char) (rem - 10 + 65)));
            } else remString.append(rem);
            
        } while(quotient != 0);
        remString.reverse();
        return remString.substring(0);
    }
    
    public String getConvertedNumber() {
        /**
         * returns the converted value
         */
        return this.convertedNumber;
    }
    
    private void setConvertedNumber(String newValue) {
        /**
         * Helper method to set convertedNumber to a new value
         */
        this.convertedNumber = newValue;
    }
    
    private void setBaseTenNumber(int baseTenNo) {
        this.baseTenNumber = baseTenNo;
    }

    private int baseTenNumber;
    private String convertedNumber;
}
