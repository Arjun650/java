import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int low = left;
        int high = mid + 1;
        int k = 0; // index for temp array
        int[] temp = new int[right - left + 1];

        while (low <= mid && high <= right) {
            if (arr[low] <= arr[high]) {
                temp[k++] = arr[low++];
            } else {
                temp[k++] = arr[high++];
            }
        }

        while (low <= mid) {
            temp[k++] = arr[low++];
        }
        while (high <= right) {
            temp[k++] = arr[high++];
        }

        // copy back only into range [left, right]
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 4, 2, 11, 53, 24, 72, 13, 19, 1};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
