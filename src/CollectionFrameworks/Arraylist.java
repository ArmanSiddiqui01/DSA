package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0,3);
        a.add(1,4);
        a.add(2,5);
        System.out.println(a);
        ArrayList<String> a1=new ArrayList<>();
        a1.add(0,"Arman");
        a1.add(1,"Deepak sir");
        a1.add(2,"Irfan brother");
        System.out.println(a1);

        System.out.println(a.contains(500));
        System.out.println(a.contains(3));
        System.out.println(a1.add("deepak"));
        System.out.println(a1); //updated
        boolean b=a.isEmpty();
        System.out.println(b);
        System.out.println(a.size());
        System.out.println(a.reversed());
        System.out.println(a.remove(2));
        System.out.println(a);
        /*
        Iterator<Integer> itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator<String> i=a1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        can be simplify*/
        for(Integer l:a){
            System.out.println(l);
        }
        for(String s:a1){
            System.out.println(s);
        }

    }
}
