
/**
 * Exercise 5: Standard Deviation
 * @author Jonathan Barisere
 */

package standarddeviation;

import java.util.Scanner;

public class StandardDeviation {
    
    /**
     *
     * @param elements the array of data elements
     * @return the mean
     */
    public static double getMean(double[] elements) {
        float total = 0;
        for (double x : elements)
            total += x;
        return total / elements.length;
    }
    
    /**
     * 
     * @param elements the array of data elements
     * @param mean the mean of the elements
     * @return the standard deviation
     */
    public static double getSD(double[] elements, double mean) {
        float deviation = 0;
        for (double x : elements)
            deviation += Math.pow(x - mean, 2);
        return Math.sqrt(deviation / elements.length);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] data = new double[5];
        
        System.out.println("Input ten doubles after the prompt");
        
        for (int x = 0; x < data.length; x++)
            data[x] = input.nextDouble();
        for (double x: data)
            System.out.println(x);
        
        double mean = getMean(data);
        double SD = getSD(data, mean);
        
        System.out.printf("Mean: %.2f\nStandard Deviation: %.2f", mean, SD);
        System.exit(0);
    }
    
}
