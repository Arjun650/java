public class LongestRepeatingCharRep {
    public static void main(String[] args) {
        String st = "ABAB";
        int[] freq = new int[26];
        int left = 0;
        int k = 2;
        int right = 0;
        int maxFreq = 0;
        int maxLen = 0;
        char[] s = st.toCharArray();

        while (right < s.length) {
            freq[s[right] - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s[right] - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freq[s[left] - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        System.out.println(maxLen);
    }
}
