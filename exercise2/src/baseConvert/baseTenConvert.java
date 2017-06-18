/**
 * Exercise2: Base Ten to Other Bases Conversion
 * @author jonathanks
 */

package baseConvert;

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
        return this.convertedNumber;
    }
    private void setConvertedNumber(String newValue) {
        this.convertedNumber = newValue;
    }
    private void setBaseTenNumber(int baseTenNo) {
        this.baseTenNumber = baseTenNo;
    }

    private int baseTenNumber;
    private String convertedNumber;
}