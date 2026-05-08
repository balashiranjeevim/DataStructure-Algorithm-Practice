/*


12345
1234
123
12
1

Print this Pattern - USE RECURSION
*/

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {

        if (n == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }

        System.out.println();
        printPattern(n - 1);

    }

}
