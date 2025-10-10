import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Comparator<String> com = new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length() > s2.length()) return 1; 
                else return -1; 
            }
        };

        // Add strings
        list.add("sdkfj");
        list.add("fs");
        list.add("Cheasdrry");
        list.add("fdsdf");
        list.add("ss");
        list.add("sag");
        list.add("a");


        Collections.sort(list, com); 
        System.out.println(list);
    }
}
