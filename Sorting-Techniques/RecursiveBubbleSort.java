/* 

Implement the Bubble Sort using Recursion.

*/

public class RecursiveBubbleSort{
    public static void main(String[] args){
        int[] array = {35, 2, 45, 50, 7, 18, 1, 20, 100, 12, 6};
        recursiveBubbleSort(array, array.length);

        for (int num : array) System.out.print(num+" ");
    }

    public static int[] recursiveBubbleSort(int[] array, int size ){
        if(size == 1){
            return array;
        }
        int i=0;
        while(i<size-1){
            if(array[i]>array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            i++;
        }

        return recursiveBubbleSort(array, size-1);
    }
}