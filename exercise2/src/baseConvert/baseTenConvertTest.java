package baseConvert;

import java.util.Scanner;
/**
 * @author jonathanks
 */
public class baseTenConvertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testNumber = input.nextInt();
        int testBase = input.nextInt();
        baseTenConvert convert = new baseTenConvert(testNumber, testBase);
        System.out.println(convert.getConvertedNumber());
    }
    
}
