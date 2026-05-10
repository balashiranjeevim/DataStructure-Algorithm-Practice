/*

*
**
***
****
*****
****
***
**
*

Print the Pattern.

*/

import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int layer = input.nextInt();
        int maxCh = (layer + 1) / 2;
        for (int i = 1; i <= layer; i++) {
            if (i > maxCh) {
                for (int j = i; j < maxCh * 2; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.err.println();
        }

    }
}
