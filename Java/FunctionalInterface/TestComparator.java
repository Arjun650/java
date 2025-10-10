import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class InnerComparator {
    String name;
    int rollno;
}

public class TestComparator {
    public static void main(String[] args) {

        InnerComparator[] ar = new InnerComparator[5];

        for (int i = 0; i < 5; i++) {
            ar[i] = new InnerComparator();
            ar[i].name = "skj";
            ar[i].rollno = (int)(Math.random() * 10);
        }

        
        Comparator<InnerComparator> com = new Comparator<InnerComparator>(){
            public int compare(InnerComparator a, InnerComparator b){
                return a.rollno - b.rollno; 
            }
        }; 
        
        Arrays.sort(ar, com);

        Arrays.sort(ar, (a,b) -> a.rollno - b.rollno); 
        
        for (InnerComparator em : ar) {
            System.out.println(em.name + " " + em.rollno);
        }
        

    }
}
