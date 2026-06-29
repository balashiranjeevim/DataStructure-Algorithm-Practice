/*

Rotate matrix by 90 degrees

Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
The rotation must be done in place, meaning the input 2D matrix must be modified directly.


Example 1

Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

Example 2
Input: matrix = [[0, 1, 1, 2], [2, 0, 3, 1], [4, 5, 0, 5], [5, 6, 7, 0]]
Output: matrix = [[5, 4, 2, 0], [6, 5, 0, 1], [7, 0, 3, 1], [0, 5, 1, 2]]

*/

package Arrays.Medium;

import java.util.Arrays;

public class RotateMatrixBy90Degrees {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotateMatrix90Degree(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotateMatrix90Degree(int[][] matrix){

        //Transpose the Array;

        int size = matrix.length;

        for(int i=0; i<size ; i++){
            for(int j= i+1; j<size; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse the Transposed Array to get 90 degree roated array

        for(int i =0; i<size; i++){
            int left = 0;
            int right = size-1;

            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }

        }


    }

}
