package CollectionFrameworks;

import java.util.ListIterator;
import java.util.Enumeration;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Vector;
import java.util.LinkedList;

public class Cursor {
    void iterator(){
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);

       /* Iterator<Integer> itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        for(Integer i:s){
            System.out.println(i);
        }
    }
    void listIterator(List<Integer> s){
        s.add(11);
        s.add(12);
        s.add(13);

        ListIterator<Integer> li=s.listIterator();
        li.next();
        li.next();
        li.next();
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
    void enumeration(){
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);
        Enumeration<Integer> e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
    public static void main(String[] args) {
        Cursor c=new Cursor();
        c.iterator();
        c.listIterator(new LinkedList<>());
        c.enumeration();

    }
}
