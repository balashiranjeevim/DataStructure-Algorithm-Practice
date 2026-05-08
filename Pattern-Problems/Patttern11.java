/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

print the Pattern

*/

import java.util.Scanner;

public class Patttern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int layer = input.nextInt();

        for (int i = 1; i <= layer; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
