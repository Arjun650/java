public class ReverseString {

    public static void revString(char[] str, int start, int end) {
        if (start >= end) {
            return;
        }

        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        revString(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String st = "arjunkumar";

        char[] arr = st.toCharArray(); 
        revString(arr, 0, arr.length - 1);

        String reversed = new String(arr); 
        System.out.println(reversed);
    }
}
