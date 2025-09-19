package bitManipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String bin = "10100";

        int result = 0;
        int pow = 1;

        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                result += pow;
            }
            pow = pow * 2;
        }

        System.out.println(result);
    }
}
