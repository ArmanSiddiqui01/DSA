package CollectionFrameworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
1.HashMap stores the value in key-value pair
each key-value pair is known as
Entry
2.In HashMap key should always be unique
but values can be duplicate
3.HashMap contains max one null values in key ,but it can store
multiple null values in value
4.HashMap can store heterogeneous element
5.HashMap does not follow the sorting and insertion order
6.HashMap is non-synchronized data stricture

Set and Iterator are Interface
*/
public class HashMapC {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(1,2);
        h.put(2,3);
        System.out.println(h);
        for(Map.Entry<Integer,Integer> me:h.entrySet()){
            System.out.println(me.getKey()+"->"+me.getValue());
        };

//        Set set =h.entrySet();
//        Iterator it=set.iterator();
//        while(it.hasNext()){
//            //System.out.println(it.next());
//            Map.Entry<Integer,Integer> entry=(Map.Entry<Integer,Integer>) it.next();
//            System.out.println(entry.getKey()+"" +entry.getValue());
//        }
//
//        System.out.println(set);
//
//        Iterator<Integer> itr=h.keySet().iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//            //Map.Entry entry=(Map.Entry) itr.next();
//        }

    }
}
