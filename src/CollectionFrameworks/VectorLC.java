package CollectionFrameworks;

import java.util.Vector;

public class VectorLC {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(0,1);
        v.add(1,2);
        v.addElement(3);
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.remove(2));
        //System.out.println(v.removeElementAt());
        System.out.println(v.capacity());
        //System.out.println(v.removeAllElement());
        System.out.println(v.removeElement(1));
        for(Integer i:v){
            System.out.println(i);
        }


    }
}
