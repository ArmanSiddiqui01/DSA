package CollectionFrameworks;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(0,1);
        l.add(1,2);
        l.add(2,3);
        System.out.println(l);

        LinkedList<String> s=new LinkedList<>();
        s.add(0,"Iron Man");
        s.add(1,"Tony Stark");
        s.add(3,"Captain America");
        for(Integer i:l){
            System.out.println(l);
        }

    }
}
