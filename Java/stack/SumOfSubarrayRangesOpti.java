import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayRangesOpti {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        int[] pge = findPGE(arr);
        int[] nge = findNGE(arr);
        int total = 0;

        // sum of min contributions
        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total -= arr[i] * left * right;
        }

        // subtract sum of max contributions
        for (int i = 0; i < arr.length; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;
            total += arr[i] * left * right;
        }

        System.out.println(total);

    }

    public static int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            res[i] = st.isEmpty() ? n : st.peek(); // use n if no smaller element
            st.push(i);
        }
        return res;
    }

    public static int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return res;
    }

    public static int[] findPGE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return res;
    }

    public static int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();
            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return res;
    }

}
