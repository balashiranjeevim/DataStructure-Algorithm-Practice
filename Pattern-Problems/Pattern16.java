/*

A
BB
CCC
DDDD
EEEEE

*/

import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int layer = input.nextInt();

        for(int i=65; i<65+layer; i++){
            for(int j= 0; j<i-64;j++){
                char value = (char) i;
                System.out.print(value);
            }
            System.out.println("");
        }
    }
    
}
