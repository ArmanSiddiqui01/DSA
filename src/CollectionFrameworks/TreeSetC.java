package CollectionFrameworks;

import java.util.TreeSet;

/*
It is not index base data structure
It does not follow the insertion order
It follow sorting order => compareTo(Object obj)
It stores homogeneous element ie same datatype
It cannot store the duplicate element
It is non-synchronized data structure
It cannot store null value before 1.6=>yes possible
 */
public class TreeSetC {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(10);
        t.add(200);
        t.add(30);
        t.add(400);
        t.add(0);
        System.out.println(t);
        //t.clear();
        t.remove(10);
        System.out.println(t);
        System.out.println(t.size());
        t.addLast(90);
        t.addFirst(1);
        t.addLast(88);
        t.getFirst();

    }
}
