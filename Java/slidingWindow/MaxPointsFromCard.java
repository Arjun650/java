public class MaxPointsFromCard {
    public static void main(String[] args) {
        int[] cards = {9,7,7,9,7,7,9}; 
        int k = 7; 


        int maxSum = 0; 


        for(int i = 0; i < k; i++){
            maxSum += cards[i]; 
        }
        int sum = maxSum; 
        for(int i = cards.length - 1; i >= cards.length - k; i--){
            sum = sum + cards[i]; 
            sum = sum - cards[cards.length - 1 - i]; 
            maxSum = Math.max(maxSum, sum); 
        }


        System.out.println(maxSum);
    }
}
