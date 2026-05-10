/*

1
2 3
4 5 6
7 8 9 10 
11 12 13 14 15


Print This Pattern.

*/

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int layer = input.nextInt();
        int last_num = 0;
        int temp = 0;

        for (int i = 1; i <= layer; i++) {
            for (int j = last_num + 1; j < last_num + i + 1; j++) {
                System.out.print(j + " ");
                temp = j;
            }
            last_num = temp;
            System.err.println("");
        }
    }
}
