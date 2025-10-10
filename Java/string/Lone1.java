public class Lone1 {
    public static void main(String[] args) {
        String st = "121"; 
        int count = 0; 
        int len = st.length();

        for(int i = 0; i < len; i++){
            if(i == 0 && st.charAt(0) == '1'){
                count += (len > 1 && st.charAt(1) == '1') ? 0 : 1; 
            }
            else if(i == len - 1 && st.charAt(len - 1) == '1'){
                count += (st.charAt(len - 2) == '1') ? 0 : 1; 
            }
            else if(st.charAt(i) == '1'){
                if(st.charAt(i - 1) != '1' && st.charAt(i + 1) != '1'){
                    count++; 
                }
            }
        }

        System.out.println(count);
    }
}
