/*

Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

*/

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();

        System.out.println(isPrime(Number));
    }
    static boolean isPrime(int n) {
        // code here
        if (n==1){
            return false;
        }
        else if (n==2){
            return true;
        }
        else if( n%2 == 0){
            return false;
        }
        else{
            for(int i=1; i*i<=n; i++){
                if(i != 1 && i != n){
                    if(n%i == 0){
                        return  false;
                    }
                }
            }
        }
        return true;
    }
}
