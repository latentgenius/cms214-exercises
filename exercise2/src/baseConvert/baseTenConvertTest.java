/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseConvert;

import java.util.Scanner;
/**
 *
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
