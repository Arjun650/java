package bitManipulation;

public class DecimalToBinary {
    public static void main(String args[]) {
        String res = "";
        int n = 10;

        while (n > 0) {
            if (n % 2 == 1) {
                res += '1';
            } else {
                res += '0';
            }

            n = n / 2;
        }

        // reverse the string
        res = new StringBuilder(res).reverse().toString();

        System.out.println(res); // 10100
    }
}
