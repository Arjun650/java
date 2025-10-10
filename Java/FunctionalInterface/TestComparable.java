import java.util.Arrays;

class InnerComparator implements Comparable<InnerComparator> {
    String name;
    int rollno;

    public int compareTo(InnerComparator other) {
        return this.name.charAt(0) - other.name.charAt(0);
    }
}

public class TestComparable {
    public static void main(String[] args) {
        InnerComparator[] ar = new InnerComparator[5];

        for (int i = 0; i < 5; i++) {
            ar[i] = new InnerComparator();
            ar[i].name =  (char) ('a' + (int)(Math.random() * 10)) + "dkjf";
            ar[i].rollno = (int)(Math.random() * 10);
        }

        Arrays.sort(ar);

        for (InnerComparator em : ar) {
            System.out.println(em.name + " " + em.rollno);
        }
    }
}
