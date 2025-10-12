import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InnerComparator implements Comparable<InnerComparator> {
    String name;
    int rollno;

    public int compareTo(InnerComparator other) {
        return this.name.charAt(0) - other.name.charAt(0);
    }
}

public class TestComparable {
    public static void main(String[] args) {
        // InnerComparator[] ar = new InnerComparator[5];

        List<InnerComparator> ar = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            InnerComparator ic = new InnerComparator();
            ic.name = (char) ('a' + (int) (Math.random() * 10)) + "dkjf";
            ic.rollno = (int) (Math.random() * 10);
            ar.add(ic); // Add to the list
        }

        // Arrays.sort(ar);

        // for (InnerComparator em : ar) {
        // System.out.println(em.name + " " + em.rollno);
        // }

        ar.forEach(n -> System.out.println(n.name + "" + n.rollno));
    }
}
