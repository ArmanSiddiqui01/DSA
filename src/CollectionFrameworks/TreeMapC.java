package CollectionFrameworks;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapC {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(101,"arman");
        t.put(102,"hemant");
        t.put(109,"deepak");
        t.put(103,"chemistry");
//        System.out.println(t);
//        System.out.println(t.ceilingEntry(101));
//        System.out.println(t.ceilingEntry(104));//equals to or greater than
//        System.out.println(t.floorEntry(104));//equals to or less than
//        System.out.println(t.size());
//        System.out.println(t.remove(101));
//        System.out.println(t.replace(102,"farhan"));
//        System.out.println(t.firstEntry());
//        System.out.println(t.lastEntry());
//        System.out.println(t.clone());
//        System.out.println(t.firstKey());
//        System.out.println(t.get(101)); //If not present than return null
//        System.out.println(t.headMap(109));//first entry is stored
//        System.out.println(t.descendingMap().higherEntry(103));//103 se lower entry
//        System.out.println(t.higherEntry(103)); //103 se higher entry or greater key entry
//        System.out.println(t.higherEntry(109));// not higher than 109 than return null
//        System.out.println(t.keySet());
//        System.out.println(t.pollFirstEntry()); //first entry removed
//        System.out.println(t.pollLastEntry());//remove last entry in sorting order
//        System.out.println(t);
        System.out.println(t.subMap(101,109));//101<=t<109


//        TreeMap m=new TreeMap();
//        m.put(101,"all");
//        m.put("a",88);
//        System.out.println(m);

    }
}
