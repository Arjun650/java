public class binarySer {
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }
        
        int mid = left + (right - left) / 2; // To avoid overflow
        
        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearch(arr, target, mid + 1, right); // Search in the right half
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
