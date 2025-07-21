import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 12, 13, 18, 20}; 

        for (int i = 0; i < arr.length - 1; i++) {
            int getMin = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[getMin]) {
                    getMin = j;
                }
            }

            // Only swap if needed
            if (getMin != i) {
                arr[i] = arr[i] ^ arr[getMin];
                arr[getMin] = arr[i] ^ arr[getMin];
                arr[i] = arr[i] ^ arr[getMin];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
