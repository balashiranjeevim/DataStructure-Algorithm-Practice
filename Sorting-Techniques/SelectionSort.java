// Implement the selection sort

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 20, 3, 30, 10, 5, 1, 9, 6, 4, 2 };
        int[] sortedArray = selectionSortMethod(array);

        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] selectionSortMethod(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
