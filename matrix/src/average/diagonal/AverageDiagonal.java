/*
 * Compute the sum of average of diagonal elements of a matrix
 */
package average.diagonal;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jonathan Barisere
 */
public class AverageDiagonal {

	/**
	 * main takes no command line arguments
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Random RND = new Random();
		Scanner kbd = new Scanner(System.in);
		System.out.println("Row size of matrix: ");
		int size = kbd.nextInt();
		
		float[][] matrix = new float[size][size];
		for(int i = 0; i < matrix.length; ++i) {
			System.out.println();
			for(int j = 0; j < matrix.length; ++j) {
				matrix[i][j] = RND.nextFloat() * 100;
				System.out.printf("%f\t", matrix[i][j]);
			}
		}
		
		System.out.printf("The average of the diagonals is %f\n",
				averageDiagonal(matrix));
		System.exit(0);
	}
	
	/**
	 * @param matrix the matrix to operate on
	 * @return the sum of elements on the major diagonal
	 */
	public static double sumMajorDiagonal(float[][] matrix) {
		int rows = matrix.length;
		double diagonalSum = 0.0;
		
		for(int i = 0, j = 0; i < rows; ++i, j = i) {
			diagonalSum += matrix[i][j];
		}
		return diagonalSum;
	}
	
	/**
	 * @param matrix the matrix to operate on
	 * @return the sum of elements on the minor diagonal
	 */
	public static double sumMinorDiagonal(float[][] matrix) {
		int rows = matrix.length;
		double diagonalSum = 0.0;
		
		for (int i = rows - 1, j = 0; i >= 0; --i, ++j) {
			diagonalSum += matrix[i][j];
		}
		return diagonalSum;
	}
	
	/**
	 * @param matrix the matrix to operate on
	 * @return the average of elements on both diagonals
	 */
	public static double averageDiagonal(float[][] matrix) {
		double averagedDiagonals;
		double summedDiagonals = sumMajorDiagonal(matrix) +
				sumMinorDiagonal(matrix);
		if (matrix.length % 2 == 0)
			 averagedDiagonals = summedDiagonals / (2 * matrix.length);
		else {
			float repeated = (matrix.length / 2) + 1;
			summedDiagonals -= repeated;
			averagedDiagonals = summedDiagonals / (2 * matrix.length - 1);
		}
		
		return averagedDiagonals;
	}
	
}
