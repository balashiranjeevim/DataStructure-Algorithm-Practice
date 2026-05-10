/*

You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called it's divisor.

*/

import java.util.Scanner;

public class PrintAllDivisors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        printDivisors(n);
    }

    public static void printDivisors(int n) {

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                System.out.print(i + " ");

                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
    
}
