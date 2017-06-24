package fibonacci;
/* Print the Fibonacci series both recursively and iteratively */

import java.util.Scanner;

public class Fibonacci {

    public static void recFibonacci(int limit, int start, int last) {
        System.out.print("" + last + " ");
        int temp = start;
        start = last;
        last = (last == 0) ? ++last : temp + last;
        if (limit != 0) {
            --limit;
            recFibonacci(limit, start, last);
        } else
            System.out.println();
    }

    public static void recFibonacci(int limit) {
        recFibonacci(limit, 0, 0);
    }

    public static void iterFibonacci(int limit) {
        int start = 0, last = 0, temp;
        for (int i = 0; i <= limit; i++) {
            System.out.print("" + last + " ");
            temp = start;
            start = last;
            last = (last == 0) ? ++last : temp + last;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner kbdInput = new Scanner(System.in);
        System.out.println("================================\n"
                + "Recursive Fibonacci\n"
                + "================================");
        int fibLimit = kbdInput.nextInt();
        recFibonacci(fibLimit);

        System.out.println("================================\n"
                + "Iterative Fibonacci\n"
                + "================================");
        fibLimit = kbdInput.nextInt();
        iterFibonacci(fibLimit);
        System.exit(0);
    }
}
