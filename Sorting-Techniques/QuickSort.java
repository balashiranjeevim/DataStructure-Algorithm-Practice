/*

Implement Quick Sort.

*/

public class QuickSort {

    public static void main(String[] args){

        int[] array = {35, 2, 1, 45, 50, 7, 18, 1, 20, 100, 12, 6, 7};

        quickSort(array, 0, array.length-1);

        for(int num : array) System.out.print(num+" ");
    }

    public static int[] quickSort(int[] array, int  low, int high){
        if(high <= low){
            return array;
        }
        int pivot = array[low];
        int i = low;
        int j = high;

        while(i<j){
            while(i<=high && array[i] <= pivot){
                i++;
            }
            while(j>=low && array[j] > pivot){
                j--;
            }
            if(i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[j];
        array[j] = array[low];
        array[low] = temp;

        int partition = j;

        quickSort(array, low, partition-1);
        quickSort(array, partition+1, high);

        return array;
    }
    
}
