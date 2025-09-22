import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = findPartition(arr, low, high);

            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }

    }

    public static int findPartition(int[] arr, int low, int high) {
        int pivot = arr[low]; // choose first element as pivot
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot)
                i++;
            while (j >= low && arr[j] > pivot)
                j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j); // place pivot at correct position
        return j; // return pivot index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arrToBeSorted = { 4, 6, 2, 5, 9, 9, 1, 3 };

        quickSort(arrToBeSorted, 0, arrToBeSorted.length - 1);

        System.out.println(Arrays.toString(arrToBeSorted));
    }
}