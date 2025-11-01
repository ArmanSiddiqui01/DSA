package CollectionFrameworks;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        ArrayList<Integer> m=new ArrayList<>();
        m.add(0,1);
        m.add(1,2);
        System.out.println(m);

        HashSet<Integer> s=new HashSet<>();//or
        //s.addAll(m);
        s.add(10);//does not follow insertion order
        s.add(3);
        System.out.println(s);
        //s.clear();
        //s.add(10);hashset does not add duplicate elements
        s.add(null);
        System.out.println(s);
        for(Integer i:s){
            System.out.println(i);
        }





    }
}
