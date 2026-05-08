/*

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

print the Pattern.

*/

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int layer = input.nextInt();
        int maxCharacter = (layer * 2) - 1;
        int n = 1;

        for (int i = layer; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }
            n = n + 2;
            System.out.println("");
        }
        for(int i =0; i < layer; i++){
            for(int j=0; j < i; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < maxCharacter; k++){
                System.out.print("*");
            }
            System.err.println();
            maxCharacter -= 2;
        }
    }
}
