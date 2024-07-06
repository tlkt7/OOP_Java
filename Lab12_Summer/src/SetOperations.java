import java.util.LinkedHashSet;

public class SetOperations {

    public static void main(String[] args) {

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");


        LinkedHashSet<String> cloneSet1 = new LinkedHashSet<>(set1);
        LinkedHashSet<String> cloneSet2 = new LinkedHashSet<>(set2);


        cloneSet1.addAll(cloneSet2);
        System.out.println("Union of set1 and set2:");
        System.out.println(cloneSet1);


        cloneSet1 = new LinkedHashSet<>(set1);
        cloneSet1.removeAll(set2);
        System.out.println("\nDifference (set1 - set2):");
        System.out.println(cloneSet1);


        cloneSet1 = new LinkedHashSet<>(set1);
        cloneSet1.retainAll(set2);
        System.out.println("\nIntersection of set1 and set2:");
        System.out.println(cloneSet1);
    }
}
