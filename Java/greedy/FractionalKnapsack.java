import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value;
    int weight;
    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        int w = 50; 
        Item[] it = new Item[3];

        it[0] = new Item(60, 10); 
        it[1] = new Item(100, 20); 
        it[2] = new Item(120, 30); 

        double totalValue = 0; // changed to double
        int remainingWeight = w; 

        Arrays.sort(it, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                return Double.compare((double)b.value / b.weight, (double)a.value / a.weight);
            }
        });

        for(Item item : it){
            if(item.weight <= remainingWeight){
                totalValue += item.value; 
                remainingWeight -= item.weight; 
            } else {
                totalValue += item.value * ((double) remainingWeight / item.weight); 
                break; 
            }
        }

        System.out.println("Maximum value in Knapsack: " + totalValue);
    }
}
