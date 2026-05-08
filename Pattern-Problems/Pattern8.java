/*

*********
 *******
  *****
   ***
    *

print the Pattern.

*/

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int layer = input.nextInt();
        int maxCh = (layer * 2) - 1; // maxCh means Maximum Characters.
        String star = "";
        String space = " ";
        int n = maxCh - 2;

        for (int i = 0; i < maxCh; i++) {
            star += "*";
        }
        String dupstar = star;

        for (int j = 0; j < layer; j++) {
            System.out.println(dupstar);
            System.out.print(space);
            space += " ";
            if (j != layer - 1) {
                dupstar = star.substring(0, n);
                n = n - 2;
            }

        }
    }

}
