/*

Write a program to print the following pattern:

    *
   ***
  *****
 *******
*********


*/

import java.util.*;
class Pattern7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int layer = input.nextInt();
        int n = layer;
        int maxCh = (layer*2)-1;
        String star = "*";
        for(int i=1; i<=layer; i++){
            for(int j=1; j<n; j++ ){
                System.out.print(" ");
            }
            System.out.println(star);
            n--;
            star += "**";
        }
    }
}

