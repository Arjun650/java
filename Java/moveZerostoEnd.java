
import java.util.Arrays;

public class moveZerostoEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 12};

        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
