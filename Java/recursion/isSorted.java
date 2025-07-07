class isSorted{
    public static boolean isSorted(int[] arr, int len){
        if(len == 0 || len == 1){
            return true; 
        }

        return arr[len - 1] >= arr[len - 2] && isSorted(arr, len - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = isSorted(arr, arr.length);
        System.out.println("Is the array sorted? " + result);
    }
}