class countAnsSay{
    public static void main(String[] args) {
        String num = "1"; 
        int count = 1; 
        String result = ""; 
        int i; 
        for( i = 1 ; i < num.length(); i++){
            if(num.charAt(i - 1) == (num.charAt(i))){
                count++; 
            }
            else{
                result += count; 
                result += num.charAt(i - 1); 
                count = 1;  
            }
        }
        result += count; 
        result += num.charAt(i - 1); 


        System.out.println(result);
    }
}