/*

Find the Fibonacci Number for Given Integer.

*/

import java.util.*;

class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        return fib_Helper(f, 2, n);
    }

    public int fib_Helper(int[] f, int i, int n) {
        if (i > n) {
            return f[n];
        }
        f[i] = f[i - 1] + f[i - 2];
        return fib_Helper(f, i + 1, n);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        FibonacciNumber obj = new FibonacciNumber();
        System.out.println(obj.fib(num));
    }
}

/*
 * 
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two preceding
 * ones, starting from 0 and 1. That is,
 * 
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 * 
 * Input: n = 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * 
 * Note: Use Recursion
 * 
 */