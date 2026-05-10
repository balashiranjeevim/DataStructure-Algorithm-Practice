/*

Implement the Merge Sort.

*/


public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 20, 40, 10, 50, 30, 60 };

        mergeSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        int mid = (right + left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, mid, right);
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int size_left = (mid + 1) - left;
        int size_right = right - mid;

        int[] temp_Left_array = new int[size_left];
        int[] temp_Right_array = new int[size_right];

        for (int i = 0; i < size_left; i++) {
            temp_Left_array[i] = array[left + i];
        }
        for (int j = 0; j < size_right; j++) {
            temp_Right_array[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < size_left && j < size_right) {
            if (temp_Left_array[i] <= temp_Right_array[j]) {
                array[k] = temp_Left_array[i];
                i++;
            } else {
                array[k] = temp_Right_array[j];
                j++;
            }
            k++;
        }

        while (i < size_left) {
            array[k] = temp_Left_array[i];
            i++;
            k++;
        }
        while (j < size_right) {
            array[k] = temp_Right_array[j];
            j++;
            k++;
        }

    }
}